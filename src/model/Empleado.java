package model;

import singleton.Singleton;

public class Empleado extends Thread{
    
    Singleton singleton;

    public Empleado(){
        singleton = Singleton.getInstance();
    }

    @Override
    public void run(){
        double valor = 300000;
        for(int i = 0; i < 10; i++){
            singleton.getCuentaBancaria().sacarDinero(valor);
            System.out.println("Cantidad "+valor+" sacada");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
