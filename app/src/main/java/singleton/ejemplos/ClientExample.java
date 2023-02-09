package singleton.ejemplos;

public class ClientExample {
    public static void main(String[] args) {

        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run(){
                Sucursal sucursal = new Sucursal(new Client("Jose"));
                sucursal.retirarDinero(100);
            }
        });

        Thread c1 = new Thread(new Runnable() {
            @Override
            public void run(){
                Cajero cajero = new Cajero(new Client("Jose"));
                cajero.retirarDinero(100);
            }
        });
        
        Thread w1 = new Thread(new Runnable() {
            @Override
            public void run(){
                WebApp webApp = new WebApp(new Client("Jose"));
                webApp.transferirDinero(200);
            }
        });

        

        
    }
}
