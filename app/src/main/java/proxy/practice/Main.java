package proxy.practice;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Jose", 1939);
        Producto p1 = new Producto();
        p1.setNombre("Arroz");
        p1.setPrecio(1000);

        Producto p2 = new Producto();
        p2.setNombre("Fideo");
        p2.setPrecio(5000);

        Producto p3 = new Producto();
        p3.setNombre("PS5");
        p3.setPrecio(143000);

        persona.realizarCompra(p1);
        persona.realizarCompra(p2);
        persona.realizarCompra(p3);
    }
}
