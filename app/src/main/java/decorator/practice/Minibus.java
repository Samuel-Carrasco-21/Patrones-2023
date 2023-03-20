package decorator.practice;

public class Minibus extends Automovil{
    private int capacidad;

    public Minibus(int capacidad, String modelo, int precio) {
        super(modelo, precio);
        this.capacidad = capacidad;
    }

    @Override
    public void info(){
        System.out.println("<><><> Minibus <><><>");
        System.out.println("* Capacidad: "+capacidad);
        super.info();
    }
    
}
