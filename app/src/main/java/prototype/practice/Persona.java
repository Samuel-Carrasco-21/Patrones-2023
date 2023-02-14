package prototype.practice;

public class Persona {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    private int id;
    public int getId() {
        return id;
    }
    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
}
