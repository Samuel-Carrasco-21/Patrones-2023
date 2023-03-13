package Ejercicios_Fila_B_2.Ejercicio5;

public class Reinicio  implements IState {

    @Override
    public void handler(Computadora compu) {
        System.out.println("\n--- REINICIAR COMPU ---");
        compu.show();
        compu.setCpu(0);
        compu.setRam(0);
        compu.cerrarProgramas();
        compu.show();
        
    }
}
