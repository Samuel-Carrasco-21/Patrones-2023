package singleton.practica1;

public class Main {
    public static void main(String[] args)  throws InterruptedException {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco b1 = new Banco(new CuentaBancaria(new Client("Jose")));
                b1.realizarConversion("boliviano", "dolar", (float)100);
            }
        });

        Thread s2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco b2 = new Banco(new CuentaBancaria(new Client("Samuel")));
                b2.realizarConversion("dolar", "boliviano", (float)100);
            }
        });

        Thread s3 = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaCambio c1 = new CasaCambio(new CuentaBancaria(new Client("Ander")));
                c1.realizarConversion("dolar", "euro", (float)100);
            }
        });

        Thread s4 = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaCambio c2 = new CasaCambio(new CuentaBancaria(new Client("Michael")));
                c2.realizarConversion("euro", "dolar", (float)100);
            }
        });

        Thread s5 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista l1 = new LibreCambista(new CuentaBancaria(new Client("Michael")));
                l1.realizarConversion("boliviano", "euro", (float)100);
            }
        });

        Thread s6 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista l2 = new LibreCambista(new CuentaBancaria(new Client("Michael")));
                l2.realizarConversion("euro", "boliviano", (float)100);
            }
        });

        s1.start();
        Thread.sleep(1000);
        s2.start();
        Thread.sleep(1000);
        s3.start();
        Thread.sleep(1000);
        s4.start();
        Thread.sleep(1000);
        s5.start();
        Thread.sleep(1000);
        s6.start();
        
    }
}
