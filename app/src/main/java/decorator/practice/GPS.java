package decorator.practice;

public class GPS extends Accesorio{
    private String modeloGPS;

    public GPS(IAutomovil iAutomovil, String modeloGPS) {
        super(iAutomovil);
        this.modeloGPS = modeloGPS;
    }

    @Override
    public void decorarAutomovil(IAutomovil iAutomovil){
        System.out.println("--- Agregando GPS ---");
        super.decorarAutomovil(iAutomovil);
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- GPS ---");
        System.out.println("* Modelo GPS: "+modeloGPS);
    }

    @Override
    public void realizarAccion(){
        super.realizarAccion();
        System.out.println("--- GPS: Mostrando Ubicacion ---");
    }
}
