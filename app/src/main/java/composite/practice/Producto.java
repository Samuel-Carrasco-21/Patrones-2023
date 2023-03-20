package composite.practice;

public class Producto extends Computadora{

    public Producto(String modelo, int precio, int cantidad) {
        super(modelo, precio, cantidad);
    }

    @Override
    public void operation() {
        System.out.println("--- Computadora ---");
        System.out.println("* Modelo: "+getModelo());
        System.out.println("* Precio: "+getPrecio());
        System.out.println("* Cantidad: "+getCantidad());
    }

    @Override
    public void add(Computadora computadora) {
        System.out.println("--- OPERACION INACEPTABLE ---");
    }

    @Override
    public void remove(Computadora computadora) {
        System.out.println("--- OPERACION INACEPTABLE ---");
    }

    @Override
    public Computadora get(int position) {
        System.out.println("--- OPERACION INACEPTABLE ---");
        return null;
    }
    
}
