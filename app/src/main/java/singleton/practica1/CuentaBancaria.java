package singleton.practica1;

public class CuentaBancaria {
    private Client client;
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    private Float dineroGuardado;
    public Float getDineroGuardado() {
        return dineroGuardado;
    }
    public void setDineroGuardado(Float dineroGuardado) {
        this.dineroGuardado = dineroGuardado;
    }

    public CuentaBancaria(Client client) {
        this.client = client;
        this.dineroGuardado = (float)100;
    }

    public void mostrarCambios(){
        System.out.println("--- CAMBIOS EN LA CUENTA ---");
        System.out.println("Cliente: "+client.getName());
        System.out.println("Nuevo Dinero disponible: "+dineroGuardado+"bs");
    }

    public void mostrarMontoActual(){
        System.out.println("--- DINERO EN LA CUENTA ---");
        System.out.println("Cliente: "+client.getName());
        System.out.println("Dinero disponible: "+dineroGuardado+"bs");
    }

}
