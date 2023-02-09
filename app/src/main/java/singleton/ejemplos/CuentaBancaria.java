package singleton.ejemplos;

public class CuentaBancaria {
    
    // atributo del mismo tipo
    private static CuentaBancaria instance = null;
    private int saldo;
    // constructor privado
    private CuentaBancaria(){
        saldo = 1000;
        System.out.println("Info -> Saldo inicial: "+saldo);
    }
    // acceso global
    public static CuentaBancaria getInstance(){
        if(instance==null)
            instance = new CuentaBancaria();
        return instance;
    }

    public void retirarDinero(int amount){
        if(amount<=saldo){
            saldo-=amount;
            System.out.println("INFO:\ncantidad retirada: "+amount
            +"\nnuevo saldo: "+saldo);
        }else{
            System.out.println("Orden inaceptable");
        }
    }

}
