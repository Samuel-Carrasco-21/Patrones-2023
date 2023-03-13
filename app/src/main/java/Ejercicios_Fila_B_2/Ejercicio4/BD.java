package Ejercicios_Fila_B_2.Ejercicio4;

import java.util.Vector;

public class BD {
    private IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    private Vector<Estudiante> estudianteList = new Vector<>();
    
    public void addEstudiantes(Estudiante estudiante){
        estudianteList.add(estudiante);
    }

    public void buscarEstudiantes(){
        this.strategy.execute(estudianteList);
    }
}
