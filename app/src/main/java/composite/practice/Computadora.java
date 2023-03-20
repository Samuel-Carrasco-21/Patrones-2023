package composite.practice;

public abstract class Computadora {
    private int precio;
    private int cantidad;
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Computadora(String modelo, int precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.modelo = modelo;
    }

    public abstract void operation();
    public abstract void add(Computadora computadora);
    public abstract void remove(Computadora computadora);
    public abstract Computadora get(int position);
}
