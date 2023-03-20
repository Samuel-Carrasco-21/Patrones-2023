package decorator.practice;

public class TanqueGas extends Accesorio{
    private String modeloTanque;
    private int capacidadTanque;

    public TanqueGas(IAutomovil iAutomovil, String modeloTanque, int capacidadTanque) {
        super(iAutomovil);
        this.modeloTanque = modeloTanque;
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public void decorarAutomovil(IAutomovil iAutomovil){
        System.out.println("--- Agregando Tanque de Gas ---");
        super.decorarAutomovil(iAutomovil);
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- Tanque Gas ---");
        System.out.println("* Modelo Tanque de Gas: "+modeloTanque);
        System.out.println("* Capacidad: "+capacidadTanque);
    }

    @Override
    public void realizarAccion(){
        super.realizarAccion();
        System.out.println("--- Tanque Gas: Aceptando Gas Natural ---");
    }
    
}
