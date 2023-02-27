package mediator.practice;

public class QA extends Profesional{
    private String grado;
    public String getGrado() {
        return grado;
    }
    public QA setGrado(String grado) {
        this.grado = grado;
        return this;
    }

    public QA(String name, int ci, String grado, ICanalComunicacion canalComunicacion) {
        super(name, ci, canalComunicacion);
        this.grado = grado;
        this.setCargo("QA");
    }

    public void showInfoQA(){
        this.showInfoProfesional();
        System.out.println("Grado: "+this.getGrado());
    }

    @Override
    public void received(String msg){
        System.out.println("\n--- Mensaje Recivido ---");
        this.showInfoQA();
        System.out.println("MENSAJE: "+msg+"\n");
    }
    
}
