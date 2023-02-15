package builder.practice;

public class Vendedor {
    private BuilderComputadora builder;
    public Computadora obtenerComputadora(){
        return builder.getComputadora();
    }
    public void setComputadoraEspecifica(BuilderComputadora builder){
        this.builder = builder;
    }

    public void armarComputadora(){
        this.builder.crearComputadora();
        this.builder.establecerMonitor();
        this.builder.establecerTeclado();
        this.builder.establecerMouse();
        this.builder.establecerMemoria();
        this.builder.establecerProcesador();
        this.builder.establecerVideo();
    }
}
