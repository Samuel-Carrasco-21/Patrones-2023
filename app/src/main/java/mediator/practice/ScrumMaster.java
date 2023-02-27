package mediator.practice;

import java.util.Vector;

public class ScrumMaster extends Profesional{
    private Vector<String> certificaciones = new Vector<>();
    public Vector<String> getCertificaciones() {
        return certificaciones;
    }
    public ScrumMaster setCertificaciones(Vector<String> certificaciones) {
        this.certificaciones.addAll(certificaciones);
        return this;
    }

    public ScrumMaster(String name, int ci, Vector<String> certificaciones, ICanalComunicacion canalComunicacion) {
        super(name, ci, canalComunicacion);
        this.certificaciones.addAll(certificaciones);
        this.setCargo("SM");
    }

    public void showInfoScrum(){
        this.showInfoProfesional();
        System.out.println("Certificaciones:");
        for(int i=0;i<this.getCertificaciones().size();i++){
            System.out.println("* "+this.getCertificaciones().get(i));
        }
    }

    @Override
    public void received(String msg){
        System.out.println("\n--- Mensaje Recivido ---");
        this.showInfoScrum();
        System.out.println("MENSAJE: "+msg+"\n");
    }
}
