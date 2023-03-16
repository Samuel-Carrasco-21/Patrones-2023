package bridge.practice.WithoutBridge;

public class Linux extends Plataforma{

    private String licencia;
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Linux(String nombre, double version, String arquitectura, String licencia) {
        super(nombre, version, arquitectura);
        this.licencia = licencia;
    }

    @Override
    public void showInfo() {
        System.out.println("\n--- PLATAFORMA ---");
        System.out.println("* Nombre: "+this.getNombre());
        System.out.println("* Version: "+this.getVersion());
        System.out.println("* Arquitectura: "+this.getArquitectura());
        System.out.println("* Licencia: "+licencia);
    }
    
}
