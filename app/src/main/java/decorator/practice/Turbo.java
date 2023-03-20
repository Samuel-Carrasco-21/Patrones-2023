package decorator.practice;

public class Turbo extends Accesorio{
    private String modeloTurbo;

    public Turbo(IAutomovil iAutomovil, String modeloTurbo) {
        super(iAutomovil);
        this.modeloTurbo = modeloTurbo;
    }

    @Override
    public void decorarAutomovil(IAutomovil iAutomovil){
        System.out.println("--- Agregando Turbo ---");
        super.decorarAutomovil(iAutomovil);
    }

    @Override
    public void infoAccesorio(){
        super.infoAccesorio();
        System.out.println("--- Turbo ---");
        System.out.println("* Modelo Turbo: "+modeloTurbo);
    }

    @Override
    public void realizarAccion(){
        super.realizarAccion();
        System.out.println("--- Turbo: Aumentando Velocidad ---");
    }


    // private String attribute1;
    // private String attribute2;

    // public ConcreteDecorator1(Component component) {
    //     super(component);
    // }

    // public String getAttribute1() {
    //     return attribute1;
    // }

    // public void setAttribute1(String attribute1) {
    //     this.attribute1 = attribute1;
    // }

    // public String getAttribute2() {
    //     return attribute2;
    // }

    // public void setAttribute2(String attribute2) {
    //     this.attribute2 = attribute2;
    // }


    // public void operation() {
    //     super.operation();
    //     System.out.println(" >ConcreteDecorator1>> DECORANDO  <<<<");
    //     System.out.println(" >ConcreteDecorator1>> Agregando nueva funcionalidad  <<<<");
    // }
}
