package builder.practice;

public class ComI9 extends BuilderComputadora{

//   monitor: 45
//   teclado: luminos
//   mouse: gamer
//   memoria: 32gb
//   procesador: i9
//   video:16

    @Override
    public void establecerMonitor() {
        // TODO Auto-generated method stub
        System.out.println("\nI9-Alto:");
        this.computadora.setMonitor(45);
    }

    @Override
    public void establecerTeclado() {
        // TODO Auto-generated method stub
        // System.out.print("COM I9:");
        this.computadora.setTeclado("luminos");
    }

    @Override
    public void establecerMouse() {
        // TODO Auto-generated method stub
        // System.out.print("COM I9:");
        this.computadora.setMouse("gamer");
    }

    @Override
    public void establecerMemoria() {
        // TODO Auto-generated method stub
        // System.out.print("COM I9:");
        this.computadora.setMemoria(32);
    }

    @Override
    public void establecerProcesador() {
        // TODO Auto-generated method stub
        // System.out.print("COM I9:");
        this.computadora.setProcesador("i9");
    }

    @Override
    public void establecerVideo() {
        // TODO Auto-generated method stub
        // System.out.print("COM I9:");
        this.computadora.setVideo(16);
    }

}
