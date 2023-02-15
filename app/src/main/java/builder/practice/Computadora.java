package builder.practice;

public class Computadora {
    private int monitor;
    public int getMonitor() {
        return monitor;
    }
    public Computadora setMonitor(int monitor) {
        this.monitor = monitor;
        return this;
    }

    private String teclado;
    public String getTeclado() {
        return teclado;
    }
    public Computadora setTeclado(String teclado) {
        this.teclado = teclado;
        return this;
    }

    private String mouse;
    public String getMouse() {
        return mouse;
    }
    public Computadora setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    private int memoria;
    public int getMemoria() {
        return memoria;
    }
    public Computadora setMemoria(int memoria) {
        this.memoria = memoria;
        return this;
    }

    private String procesador;
    public String getProcesador() {
        return procesador;
    }
    public Computadora setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    private int video;
    public int getVideo() {
        return video;
    }
    public Computadora setVideo(int video) {
        this.video = video;
        return this;
    }

//   monitor: 45
//   teclado: luminos
//   mouse: gamer
//   memoria: 32gb
//   procesador: i9
//   video:16
    public void mostrarInf(){
        System.out.println("Monitor: "+monitor);
        System.out.println("Teclado: "+teclado);
        System.out.println("Mouse: "+mouse);
        System.out.println("Memoria: "+memoria+"gb");
        System.out.println("Procesador: "+procesador);
        System.out.println("Video: "+video);
    }
}
