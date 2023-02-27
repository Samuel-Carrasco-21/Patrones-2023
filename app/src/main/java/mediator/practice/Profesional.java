package mediator.practice;

public class Profesional extends Persona{
    
    public Profesional(String name, int ci, ICanalComunicacion iCanalComunicacion) {
        super(name, ci, iCanalComunicacion);
    }

    public void showInfoProfesional() {
        System.out.println("--- PROFESIONAL ---");
        System.out.println("Nombre: "+this.getName());
        System.out.println("CI: "+this.getCi());
        System.out.println("Cargo: "+this.getCargo());
    }

    @Override
    public void send(String msg) {
        System.out.println("\n--- Mensaje enviado ---");
        this.canalComunication.send(msg,this);
    }

    @Override
    public void received(String msg){
        System.out.println("\n--- Mensaje Recivido ---");
        this.showInfoProfesional();
        System.out.println("MENSAJE: "+msg+"\n");
    }
    
}
