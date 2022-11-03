package model;

import singleton.Singleton;

public class Empresa extends Thread{
    
    Singleton singleton;


    public Empresa() {
        singleton = Singleton.getInstance();
    }

    @Override
    public void run(){
        double sueldo = 2000000;
        for(int i = 0 ; i<2; i++){
            singleton.getCuentaBancaria().ingresarDinero(sueldo);
            System.out.println("Sueldo transferido");
            try {
                sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
