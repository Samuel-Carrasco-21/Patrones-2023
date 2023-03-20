package composite.practice;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("HP-1", 100, generarRandom());
        Producto p2 = new Producto("HP-2", 100, generarRandom());
        Producto p3 = new Producto("HP-3", 100, generarRandom());

        Producto p4 = new Producto("ASUS-1", 100, generarRandom());
        Producto p5 = new Producto("ASUS-2", 100, generarRandom());
        Producto p6 = new Producto("ASUS-3", 100, generarRandom());
        Producto p7 = new Producto("ASUS-4", 100, generarRandom());

        Laboratorio l1 = new Laboratorio(null, 0, 0);
        l1.setNombreLaboratorio("Lab - 1");
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);

        Laboratorio l2 = new Laboratorio(null, 0, 0);
        l2.setNombreLaboratorio("Lab - 2");
        l2.add(p4);
        l2.add(p5);
        l2.add(p6);
        l2.add(p7);
    
        ContenedorComputadora c1 = 
        new ContenedorComputadora(null, 0, 0);
        c1.setNombreContenedor("Contedenor - 1");
        c1.add(l1);
        c1.add(l2);

        c1.operation();
    }

    public static int generarRandom(){
        return (int)(Math.random()*10);
    }
}
