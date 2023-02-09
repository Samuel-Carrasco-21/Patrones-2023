package singleton.Practica;

public class Producto {
    private int IDProducto;
    public int getIDProducto() {
        return IDProducto;
    }
    public void setIDProducto(int iDProducto) {
        IDProducto = iDProducto;
    }
    private int cantidad;
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    private int precio;
    public int getPrecio(){
        return precio;
    }
    public Producto(int iDProducto, int cantidad, int precio) {
        this.IDProducto = iDProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
