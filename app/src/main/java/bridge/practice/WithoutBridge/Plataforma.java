package bridge.practice.WithoutBridge;

public abstract class Plataforma {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double version;
    public double getVersion() {
        return version;
    }
    public void setVersion(double version) {
        this.version = version;
    }

    private String arquitectura;
    public String getArquitectura() {
        return arquitectura;
    }
    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public Plataforma(String nombre, double version, String arquitectura){
        this.nombre = nombre;
        this.version = version;
        this.arquitectura = arquitectura;
    }

    public abstract void showInfo();
}
