package Ejercicios_Fila_B_2.Ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Estrategia3 implements IStrategy{

    @Override
    public void execute(Vector<Estudiante> estudiantesList) {
        Map<String,Vector<Estudiante>> estudianteCarreras = new HashMap<>();
        for(int i=0;i<estudiantesList.size();i++){
            if(!estudianteCarreras.containsKey(
                estudiantesList.get(i).getCarrera())){
                Vector<Estudiante> aux = new Vector<>();
                aux.add(estudiantesList.get(i));
                estudianteCarreras.put(
                    estudiantesList.get(i).getCarrera(),
                    aux);
            }else{  
                estudianteCarreras.get(
                    estudiantesList.get(i).getCarrera()
                    ).add(estudiantesList.get(i));
            }
        }

        for(Map.Entry<String, Vector<Estudiante>> entry:
            estudianteCarreras.entrySet()){
                System.out.println("<<<<<<< Carrera "+entry.getKey()+" >>>>>>>");
                entry.getValue()
                .forEach(i->i.info());
        }
    }
    
}
