package Ejercicio_Fila_B.Ejercicio1;
public class Estudiante{
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int CI;
    public int getCI() {
        return CI;
    }
    public void setCI(int cI) {
        CI = cI;
    }

    public Estudiante(String nombre, int cI) {
        this.nombre = nombre;
        CI = cI;
    }    
}
