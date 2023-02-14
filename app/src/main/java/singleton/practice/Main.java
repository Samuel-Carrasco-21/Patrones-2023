package singleton.practice;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run(){
                Clientes c1 = new Clientes("Jose", 2003);
                c1.escogerProducto(1, 3);
            }
        });
        user1.start();
        Thread.sleep(0500);
        Logger.getInstance().saldoDisponible();
    }
}
