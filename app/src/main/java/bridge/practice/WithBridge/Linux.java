package bridge.practice.WithBridge;

public class Linux implements IPlataforma{
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

    private String distribucion;
    public String getDistribucion() {
        return distribucion;
    }
    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    private IArquitectura arquitectura;
    public IArquitectura getArquitectura() {
        return arquitectura;
    }
    public void setArquitectura(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    public Linux(String nombre, Double version, String distribucion, IArquitectura arquitectura) {
        this.nombre = nombre;
        this.version = version;
        this.distribucion = distribucion;
        this.arquitectura = arquitectura;
    }
    
    @Override
    public void showPlataforma() {
        System.out.println("\n--- Plataforma ---");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Version: "+version);
        System.out.println("* Distribucion: "+distribucion);
        informacionArquitectura();
    }

    @Override
    public void informacionArquitectura() {
        this.arquitectura.showArquitectura();
    }
    
}
