package memento.practice;

import java.util.Vector;

public class BaseDatos {
    private Vector<Personas> personas = new Vector<>();

    public void setPersonas(Vector<Personas> personas){
        if(!this.personas.isEmpty()){
            this.personas.clear();
        }
        this.personas.addAll(personas);
    }

    public void addPersonasBD(Personas personas){
        this.personas.add(personas);
    }

    public Memento createBackupBD(){
        return new Memento(this.personas);
    }

    public Vector<Personas> checkPersonas(Memento memento){
        this.personas.clear();
        this.personas.addAll(memento.getStateBaseDatos());
        return this.personas;
    }
    
    public void showPeople(){
        personas.forEach(i->i.showInfo());
    }
}
