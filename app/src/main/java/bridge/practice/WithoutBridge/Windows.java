package bridge.practice.WithoutBridge;

public class Windows extends Plataforma{

    private String empresa;
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Windows(String nombre, double version, String arquitectura, String empresa) {
        super(nombre, version, arquitectura);
        this.empresa = empresa;
    }

    @Override
    public void showInfo() {
        System.out.println("\n--- PLATAFORMA ---");
        System.out.println("* Nombre: "+this.getNombre());
        System.out.println("* Version: "+this.getVersion());
        System.out.println("* Arquitectura: "+this.getArquitectura());
        System.out.println("* Empresa: "+empresa);
    }
    
}
