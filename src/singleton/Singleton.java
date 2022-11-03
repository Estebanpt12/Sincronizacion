package singleton;

import model.CuentaBancaria;

public class Singleton {

    CuentaBancaria cuentaBancaria;

    private static class SingletonHolder {
        private final static Singleton eINSTANCE = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingletonHolder.eINSTANCE;
    }


    public Singleton() {
        inizializarDatoPrueba();
    }

    private void inizializarDatoPrueba(){
        cuentaBancaria = new CuentaBancaria(true, 0);
    }


    public CuentaBancaria getCuentaBancaria() {
        return this.cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

}
