package state.practice;

public class Reinicio implements IStateComp{
    @Override
    public void comportamientoComp(Computadora computadora) {
        System.out.println("\n--- ESTADO REINICIO ---");
        computadora.getRam().setPorcentajeUso
        (0);
        computadora.getCpu().setCantidadRecursosDisponibles
        (100);

        computadora.getRam().showRam();
        computadora.getCpu().showCpu();
        computadora.cierreProgramasAbiertos();
    }
}
