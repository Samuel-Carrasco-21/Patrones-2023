package proxy.practice;

import java.util.Scanner;

public class Persona{
    private String nombre;
    private int ci;

    private TarjetaProxy tarjetaProxy;
    
    public Persona(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
        this.tarjetaProxy = new TarjetaProxy(ci, ci*7<=9999 ? ci*7 : ci);
    }

    public void realizarCompra(Producto producto){
        System.out.println("\n--- Iniciando Operacion ---");
        infoPersona();
        int dinero = Integer.parseInt(pedirDato("cantidad de dinero a usar"));
        String tipoMoneda = pedirDato("tipo de moneda");
        tarjetaProxy.request(dinero, tipoMoneda, producto);
    }

    private void infoPersona(){
        System.out.println("--- Persona ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Ci: "+ci);
    }

    private String pedirDato(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el dato para "+mensaje+": ");
        String respuesta = scanner.nextLine();
        return respuesta.toLowerCase();
    }
    
}
