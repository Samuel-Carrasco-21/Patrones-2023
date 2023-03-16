package bridge.practice.WithoutBridge;

public class Linuxx86 extends Linux{

    private String distribucionx86;
    public String getDistribucion() {
        return distribucionx86;
    }
    public void setDistribucion(String distribucionx86) {
        this.distribucionx86 = distribucionx86;
    }

    public Linuxx86(
        String nombre,
        double version,
        String arquitectura,
        String licencia,
        String distribucionx86) {
        super(nombre, version, arquitectura, licencia);
        this.distribucionx86 = distribucionx86;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("* Distribucion: "+distribucionx86);
        System.out.println("-----------------");
    }    
}
