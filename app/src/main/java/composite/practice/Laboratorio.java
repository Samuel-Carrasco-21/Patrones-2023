package composite.practice;

import java.util.Vector;

public class Laboratorio extends Computadora{
    private int precioLab;
    public int getPrecioLab() {
        return precioLab;
    }

    private String nombreLaboratorio;
    public String getNombreLaboratorio() {
        return nombreLaboratorio;
    }
    public void setNombreLaboratorio(String nombreLaboratorio) {
        this.nombreLaboratorio = nombreLaboratorio;
    }

    private Vector<Computadora> compVector = new Vector<>();

    public Laboratorio(String modelo, int precio, int cantidad) {
        super(modelo, precio, cantidad);
    }

    @Override
    public void operation() {
        System.out.println("<><><> LABORATORIO <><><>");
        System.out.println("* Nombre: "+nombreLaboratorio);
        System.out.println("* Valor Total: "+precioLab);
        System.out.println("* Computadoras:");
        compVector.forEach(i->i.operation());
    }

    @Override
    public void add(Computadora computadora) {
        System.out.println("--- Agregando Computadora ---");
        compVector.add(computadora);
        precioLab += computadora.getPrecio()*computadora.getCantidad();
    }

    @Override
    public void remove(Computadora computadora) {
        System.out.println("--- Eliminando Computadora ---");
        compVector.remove(computadora);
        precioLab -= computadora.getPrecio()*computadora.getCantidad();
    }

    @Override
    public Computadora get(int position) {
        System.out.println("--- Obteniendo Computadora ---");
        return compVector.get(position);
    }
    
}
