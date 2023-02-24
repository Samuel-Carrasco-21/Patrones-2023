package Ejercicio_Fila_B.Ejercicio3;

public class PelotaFutbolCreator extends Creator{

    @Override
    public PelotaFutbol factoryMethod() {
        // TODO Auto-generated method stub
        PelotaFutbol pelotaFutbol = new PelotaFutbol();
        pelotaFutbol.setColor("Azul");
        pelotaFutbol.setGarantia(10);
        pelotaFutbol.setTamano(30);
        pelotaFutbol.setPrecio(70);
        pelotaFutbol.create();
        return pelotaFutbol;
    }
    
}
