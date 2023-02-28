package memento.practice;

import java.util.Vector;

public class Memento {
    private Vector<Personas> personas = new Vector<>();

    public Memento(Vector<Personas> personas){
        this.personas.addAll(personas);
    }

    public Vector<Personas> getStateBaseDatos(){
        return this.personas;
    }
}
