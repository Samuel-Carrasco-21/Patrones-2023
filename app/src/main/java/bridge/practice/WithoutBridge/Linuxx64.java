package bridge.practice.WithoutBridge;

public class Linuxx64 extends Linux{

    private String distribucionx64;
    public String getDistribucion() {
        return distribucionx64;
    }
    public void setDistribucion(String distribucionx64) {
        this.distribucionx64 = distribucionx64;
    }

    public Linuxx64(
        String nombre,
        double version,
        String arquitectura,
        String licencia,
        String distribucionx64) {
        super(nombre, version, arquitectura, licencia);
        this.distribucionx64 = distribucionx64;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("* Distribucion: "+distribucionx64);
        System.out.println("-----------------");
    }    
}
