package Ejercicio_Fila_B.Ejercicio3;

public class Camiseta implements IElemento{
    private int tamano;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void create() {
        // TODO Auto-generated method stub
        System.out.println("Creando Camiseta");
    }

    @Override
    public void showInfo() {
        System.out.println("\nCAMISETA:");
        System.out.println("Size: "+tamano);
        System.out.println("Precio: "+precio);
    }
}
