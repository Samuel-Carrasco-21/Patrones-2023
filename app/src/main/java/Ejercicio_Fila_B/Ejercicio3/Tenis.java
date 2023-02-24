package Ejercicio_Fila_B.Ejercicio3;

public class Tenis implements IElemento{
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    private int tamano;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public void create() {
        // TODO Auto-generated method stub
        System.out.println("Creando Tenis");
    }

    @Override
    public void showInfo() {
        System.out.println("\nTENIS:");
        System.out.println("Size: "+tamano);
        System.out.println("Precio: "+precio);
    }
}
