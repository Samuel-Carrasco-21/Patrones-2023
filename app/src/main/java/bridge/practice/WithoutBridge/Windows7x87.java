package bridge.practice.WithoutBridge;

public class Windows7x87 extends Windows{

    private String IPv4;
    public String getIP() {
        return IPv4;
    }
    public void setIP(String IPv4) {
        this.IPv4 = IPv4;
    }

    public Windows7x87(
        String nombre, 
        double version,
        String arquitectura, 
        String empresa,
        String IPv4) {
        super(nombre, version, arquitectura, empresa);
        this.IPv4 = IPv4;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("* IPv4: "+IPv4);
        System.out.println("---------------");
    }
    
}
