package bridge.practice.WithBridge;

public class Windows implements IPlataforma{
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Double version;
    public Double getVersion() {
        return version;
    }
    public void setVersion(Double version) {
        this.version = version;
    }

    private String empresa;
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    private IArquitectura arquitectura;
    public IArquitectura getArquitectura() {
        return arquitectura;
    }
    public void setArquitectura(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    public Windows(String nombre, Double version, String empresa, IArquitectura arquitectura) {
        this.nombre = nombre;
        this.version = version;
        this.empresa = empresa;
        this.arquitectura = arquitectura;
    }

    @Override
    public void showPlataforma() {
        System.out.println("\n--- Plataforma ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Version: "+version);
        System.out.println("* Empresa: "+empresa);
        informacionArquitectura();
    }

    @Override
    public void informacionArquitectura() {
        this.arquitectura.showArquitectura();
    }
    
}
