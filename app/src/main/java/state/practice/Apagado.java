package state.practice;

public class Apagado implements IStateComp{

    @Override
    public void comportamientoComp(Computadora computadora) {
        System.out.println("\n--- ESTADO APAGADO ---");
        computadora.getRam().setPorcentajeUso
        (1);
        computadora.getCpu().setCantidadRecursosDisponibles
        (99);
        computadora.cierreTotalProgramas();

        computadora.getRam().showRam();
        computadora.getCpu().showCpu();
        computadora.estadoProgramas();
    }
    
}
