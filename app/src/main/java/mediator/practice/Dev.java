package mediator.practice;

public class Dev extends Profesional{
    private String lenguaje;
    public String getLenguaje() {
        return lenguaje;
    }
    public Dev setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
        return this;
    }

    public Dev(String name, int ci, String lenguaje, ICanalComunicacion canalComunicacion) {
        super(name, ci, canalComunicacion);
        this.lenguaje = lenguaje;
        this.setCargo("DEV");
    }

    public void showInfoDev(){
        this.showInfoProfesional();
        System.out.println("Lenguaje: "+this.getLenguaje());
    }

    @Override
    public void received(String msg){
        System.out.println("\n--- Mensaje Recivido ---");
        this.showInfoDev();
        System.out.println("MENSAJE: "+msg+"\n");
    }
}
