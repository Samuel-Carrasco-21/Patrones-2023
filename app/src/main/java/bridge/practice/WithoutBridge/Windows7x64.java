package bridge.practice.WithoutBridge;

public class Windows7x64 extends Windows{

    private String IPv6;
    public String getIP() {
        return IPv6;
    }
    public void setIP(String IPv6) {
        this.IPv6 = IPv6;
    }

    public Windows7x64(
        String nombre, 
        double version,
        String arquitectura, 
        String empresa,
        String IPv6) {
        super(nombre, version, arquitectura, empresa);
        this.IPv6 = IPv6;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("* IPv6: "+IPv6);
        System.out.println("---------------");
    }
    
}