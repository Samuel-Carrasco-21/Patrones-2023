package memento.example;

public class Memento {
    private Proyect proyect;
    public Proyect getProyect() {
        return proyect;
    }
    public void setProyect(Proyect proyect) {
        this.proyect = proyect;
    }
    
    public Memento(Proyect proyect) {
        this.proyect = proyect;
    }

    
}
