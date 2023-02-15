package builder.practice;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        ComI5 comI5 = new ComI5();
        ComI7 comI7 = new ComI7();
        ComI9 comI9 = new ComI9();

        vendedor.setComputadoraEspecifica(comI9);
        vendedor.armarComputadora();

        Computadora c1 = vendedor.obtenerComputadora();
        c1.mostrarInf();

        vendedor.setComputadoraEspecifica(comI7);
        vendedor.armarComputadora();

        Computadora c2 = vendedor.obtenerComputadora();
        c2.mostrarInf();

        vendedor.setComputadoraEspecifica(comI5);
        vendedor.armarComputadora();

        Computadora c3 = vendedor.obtenerComputadora();
        c3.mostrarInf();
    }
}
