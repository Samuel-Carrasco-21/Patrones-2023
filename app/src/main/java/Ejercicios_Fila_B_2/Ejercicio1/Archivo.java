package Ejercicios_Fila_B_2.Ejercicio1;

public class Archivo {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public Archivo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    private String version;
    public String getVersion() {
        return version;
    }
    public Archivo setVersion(String version) {
        this.version = version;
        return this;
    }

    private String conenido;
    public String getConenido() {
        return conenido;
    }
    public Archivo setConenido(String conenido) {
        this.conenido = conenido;
        return this;
    }

    public Archivo(String nombre, String version, String conenido) {
        this.nombre = nombre;
        this.version = version;
        this.conenido = conenido;
    }

    public void info(){
        System.out.println("*************");
        System.out.println("nombre: "+nombre);
        System.out.println("version: "+version);
        System.out.println("code:\n"+conenido);
        System.out.println("************");
    }

    
}
