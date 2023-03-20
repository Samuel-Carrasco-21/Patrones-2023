package decorator.practice;

public class Vagoneta extends Automovil{
    private int caballosFuerza;

    public Vagoneta(int caballosFuerza, String modelo, int precio) {
        super(modelo, precio);
        this.caballosFuerza = caballosFuerza;
    }

    @Override
    public void info(){
        System.out.println("<><><> Vagoneta <><><>");
        System.out.println("* Caballos Fuerza: "+caballosFuerza);
        super.info();
    }
    
}
