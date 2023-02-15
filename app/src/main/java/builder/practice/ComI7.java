package builder.practice;

public class ComI7 extends BuilderComputadora{

    // monitor: 32
    // teclado: luminos
    // mouse: luminos
    // memoria: 16gb
    // procesador: i7
    // video:8

    @Override
    public void establecerMonitor() {
        // TODO Auto-generated method stub
        System.out.println("\nI7-Medio:");
        this.computadora.setMonitor(32);
    }

    @Override
    public void establecerTeclado() {
        // TODO Auto-generated method stub
        // System.out.print("COM I7:");
        this.computadora.setTeclado("luminos");
    }

    @Override
    public void establecerMouse() {
        // TODO Auto-generated method stub
        // System.out.print("COM I7:");
        this.computadora.setMouse("luminos");
    }

    @Override
    public void establecerMemoria() {
        // TODO Auto-generated method stub
        // System.out.print("COM I7:");
        this.computadora.setMemoria(16);
    }

    @Override
    public void establecerProcesador() {
        // TODO Auto-generated method stub
        // System.out.print("COM I7:");
        this.computadora.setProcesador("i7");
    }

    @Override
    public void establecerVideo() {
        // TODO Auto-generated method stub
        // System.out.print("COM I7:");
        this.computadora.setVideo(8);
    }
    
}
