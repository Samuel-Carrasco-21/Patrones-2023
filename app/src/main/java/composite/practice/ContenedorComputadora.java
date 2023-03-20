package composite.practice;

import java.util.Vector;

public class ContenedorComputadora extends Computadora{
    private int precioCont;

    private Vector<Laboratorio> labVector = new Vector<>();

    private String nombreContenedor;
    public String getNombreContenedor() {
        return nombreContenedor;
    }
    public void setNombreContenedor(String nombreContenedor) {
        this.nombreContenedor = nombreContenedor;
    }

    public ContenedorComputadora(String modelo, int precio, int cantidad) {
        super(modelo, precio, cantidad);
    }

    @Override
    public void operation() {
        System.out.println("\n<><><><><><><><><><><><><><><><><>");
        System.out.println("--- Contenedor de Computadoras ---");
        System.out.println("* Nombre: "+nombreContenedor);
        System.out.println("* Valor Contenedor: "+precioCont);
        System.out.println("* Laboratorios:");
        labVector.forEach(i -> i.operation());
        System.out.println("<><><><><><><><><><><><><><><><><>");
    }

    @Override
    public void add(Computadora computadora) {
        Laboratorio laboratorio;
        laboratorio = (Laboratorio) computadora;
        labVector.add(laboratorio);
        precioCont += laboratorio.getPrecioLab();
    }

    @Override
    public void remove(Computadora computadora) {
        Laboratorio laboratorio;
        laboratorio = (Laboratorio) computadora;
        labVector.remove(laboratorio);
        precioCont -= laboratorio.getPrecioLab();
    }

    @Override
    public Computadora get(int position) {
        return labVector.get(position);
    }
    
}
