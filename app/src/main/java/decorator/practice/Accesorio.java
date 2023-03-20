package decorator.practice;

public class Accesorio implements IAutomovil{

    private IAutomovil iAutomovil;

    public Accesorio(IAutomovil iAutomovil) {
        this.iAutomovil = iAutomovil;
    }

    @Override
    public void decorarAutomovil(IAutomovil automovil) {
        if(automovil == this.iAutomovil){
            automovil.decorarAutomovil(this);
        }else{
            System.out.println("--- Comando Inaceptable ---");
        }
    }

    public void infoAccesorio(){
        System.out.println("--- ACCESORIO ---");
    }

    public void realizarAccion(){
        System.out.println("\n--- Accionando Accesorio ---");
        System.out.println("* Vehiculo:");
        Automovil automovil;
        automovil = (Automovil) iAutomovil;
        automovil.info();
    }
    
}
