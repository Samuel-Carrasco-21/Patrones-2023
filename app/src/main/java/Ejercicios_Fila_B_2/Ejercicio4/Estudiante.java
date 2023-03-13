package Ejercicios_Fila_B_2.Ejercicio4;

public class Estudiante {
    private int ci;
    public int getCi() {
        return ci;
    }
    
    private String nombre;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    private String carrera;
    public String getCarrera() {
        return carrera;
    }

    private int initialChar;
    public int getInitialChar() {
        return initialChar;
    }

    public Estudiante(int ci, String nombre, String carrera) {
        this.ci = ci;
        this.nombre = nombre;
        this.carrera = carrera.toLowerCase();
        this.initialChar = nombre.toLowerCase().toCharArray()[0] - 'a';
    }

    public void info(){
        System.out.println("--- Estudiante ---");
        System.out.println("* nombre: "+getNombre());
        System.out.println("* ci: "+getCi());
        System.out.println("* carrera: "+getCarrera());
        System.out.println("------------------");
    }

}
