package model;

public class CuentaBancaria {

    private boolean estaVacia = true;
    private double saldo = 0;



    public CuentaBancaria(boolean estaVacia, double saldo) {
        this.estaVacia = estaVacia;
        this.saldo = saldo;
    }    
    
    public synchronized void ingresarDinero(double cantidad){
        saldo += cantidad;
        estaVacia = false;
        notify();
    }

    public synchronized void sacarDinero(double cantidad){
        while(estaVacia || saldo - cantidad < 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        saldo -= cantidad;
        if(saldo == 0){
            estaVacia = true;
        }
        notify();
    }
}
