package state.practice;

public class Programa {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String estadoPrograma;
    public String getEstadoPrograma() {
        return estadoPrograma;
    }
    public void setEstadoPrograma(String estadoPrograma) {
        this.estadoPrograma = estadoPrograma;
    }

    public Programa(String nombre, String estadoPrograma) {
        this.nombre = nombre;
        this.estadoPrograma = estadoPrograma;
    }

    public void showPrograma(){
        System.out.println("----- PROGRAMA -----");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Estado: "+estadoPrograma);
        System.out.println("--------------------");
    }
}
