package memento.example;

public class Git {
    private Proyect proyect;
    public void setProyect(Proyect proyect){
        this.proyect = proyect;
    }

    public Memento createCommitProyect(){
        return new Memento(this.proyect);
    }

    public Proyect logCommit(Memento memento){
        this.proyect = memento.getProyect();
        return this.proyect;
    }
}
