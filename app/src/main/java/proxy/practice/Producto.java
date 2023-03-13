package proxy.practice;

public class Producto {
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int precio;
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void infoProducto(){
        System.out.println("--- Producto ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Precio: "+precio);
    }
}
