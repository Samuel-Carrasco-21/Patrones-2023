package Ejercicios_Fila_B_2.Ejercicio5;

public class Apagado implements IState {

    @Override
    public void handler(Computadora compu) {
        System.out.println("\n--- APAGANDO COMPU ---");
        compu.setCpu(1);
        compu.setRam(1);
        compu.show();
        
    }
    
}