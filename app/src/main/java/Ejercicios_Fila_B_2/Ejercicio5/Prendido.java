package Ejercicios_Fila_B_2.Ejercicio5;

import java.util.List;
import java.util.Random;

public class Prendido implements IState {

    @Override
    public void handler(Computadora compu) {
        System.out.println("\n--- PRENDER COMPU ---");
        int rand = new Random().nextInt(5) +1;
        int num = rand;
        for(String i: List.of("excel", "word", "visualStudio", "buscaminas")){
            if(rand>0){
                compu.addPrograma(i);
                rand--;
            }
        }
        compu.setCpu(num*5);
        compu.setRam(num*5);
        compu.show();
        
    }
    
}

