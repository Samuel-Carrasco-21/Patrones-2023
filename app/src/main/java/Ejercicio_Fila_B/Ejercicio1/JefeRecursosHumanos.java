package Ejercicio_Fila_B.Ejercicio1;

public class JefeRecursosHumanos{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarTesis(Tesis tesis, String hora, String tema){
        SistemaGuardado.getInstance().registrarTesis(tesis, hora, tema);
    }
}