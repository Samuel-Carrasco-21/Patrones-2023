package builder.practice;

public abstract class BuilderComputadora {
    protected Computadora computadora;
    public Computadora getComputadora(){
        return computadora;
    }
    public void crearComputadora(){
        computadora = new Computadora();
    }
//   monitor: 32
//   teclado: luminos
//   mouse: luminos
//   memoria: 16gb
//   procesador: i7
//   video:8
    public abstract void establecerMonitor();
    public abstract void establecerTeclado();
    public abstract void establecerMouse();
    public abstract void establecerMemoria();
    public abstract void establecerProcesador();
    public abstract void establecerVideo();
}