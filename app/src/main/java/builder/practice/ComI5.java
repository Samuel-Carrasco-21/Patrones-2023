package builder.practice;

public class ComI5 extends BuilderComputadora{

//   monitor: 24
//   teclado: normal
//   mouse: normal
//   memoria: 8gb
//   procesador: i5
//   video:4

    @Override
    public void establecerMonitor() {
        // TODO Auto-generated method stub
        System.out.println("\nI5-Bajo:");
        this.computadora.setMonitor(24);
    }

    @Override
    public void establecerTeclado() {
        // TODO Auto-generated method stub
        // System.out.print("COM I5:");
        this.computadora.setTeclado("normal");
    }

    @Override
    public void establecerMouse() {
        // TODO Auto-generated method stub
        // System.out.print("COM I5:");
        this.computadora.setMouse("normal");
    }

    @Override
    public void establecerMemoria() {
        // TODO Auto-generated method stub
        // System.out.print("COM I5:");
        this.computadora.setMemoria(8);
    }

    @Override
    public void establecerProcesador() {
        // TODO Auto-generated method stub
        // System.out.print("COM I5:");
        this.computadora.setProcesador("i5");
    }

    @Override
    public void establecerVideo() {
        // TODO Auto-generated method stub
        // System.out.print("COM I5:");
        this.computadora.setVideo(4);
    }
    
}
