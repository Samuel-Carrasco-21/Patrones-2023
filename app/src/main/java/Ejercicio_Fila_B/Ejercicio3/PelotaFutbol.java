package Ejercicio_Fila_B.Ejercicio3;

public class PelotaFutbol implements IElemento{
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
    
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    private int garantia;
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void create() {
        System.out.println("Creando Pelota Futbol");
    }

    @Override
    public void showInfo() {
        System.out.println("\nPELOTA FUTBOL:");
        System.out.println("Size: "+tamano);
        System.out.println("Precio: "+precio);
        System.out.println("Color: "+color);
        System.out.println("Garantia: "+garantia);
    }
}
