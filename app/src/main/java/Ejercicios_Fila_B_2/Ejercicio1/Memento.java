package Ejercicios_Fila_B_2.Ejercicio1;

public class Memento {
    private Archivo archivo;

    public Memento(Archivo archivo){
        this.archivo = archivo;
    }

    public Archivo getProjectState(){
        return archivo;
    }
}
