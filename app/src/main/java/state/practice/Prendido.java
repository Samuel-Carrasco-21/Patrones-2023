package state.practice;

public class Prendido implements IStateComp{

    @Override
    public void comportamientoComp(Computadora computadora) {
        
        System.out.println("\n--- ESTADO PRENDIDO ---");

        int programasRandomicos = 1000000000; //infinito
        while(programasRandomicos>computadora.getProgramas().size()){
            programasRandomicos = 
            (int)(Math.random() * computadora.getProgramas().size());
        }
        
        computadora.getRam().setPorcentajeUso(programasRandomicos*5);        
        computadora.getCpu().setCantidadRecursosDisponibles(100-programasRandomicos*5);

        computadora.getRam().showRam();
        computadora.getCpu().showCpu();
        computadora.abrirProgramas(programasRandomicos);
        System.out.println("--- ESTADO PROGRAMAS ---");
        computadora.estadoProgramas();

    }
    
}
