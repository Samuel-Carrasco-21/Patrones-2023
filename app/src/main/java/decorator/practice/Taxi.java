package decorator.practice;

public class Taxi extends Automovil{
    private String placa;

    public Taxi(String placa, String modelo, int precio) {
        super(modelo, precio);
        this.placa = placa;
    }

    @Override
    public void info(){
        System.out.println("<><><> Taxi <><><>");
        System.out.println("* Placa: "+placa);
        super.info();
    }
    
}
