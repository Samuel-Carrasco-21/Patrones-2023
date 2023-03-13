package adapter.practice;

public class Web implements IComputadora{
    private String branchComp;
    private String ip;
    private String name;

    public Web(String name){
        this.name = name;
        this.branchComp = "WebSite";
        this.ip = "A"+((int)(Math.random()*100000))+"B";
    }

    @Override
    public void iniciarSesion() {
        System.out.println("\n--- Start Sesion ---");
        System.out.println("web Login");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("\n--- End Sesion ---");
        System.out.println("Web Close");
    }

    @Override
    public void generarDatos() {
        System.out.println("\n--- Generate ---");
        System.out.println("Web Generator");
    }

    @Override
    public void infoComp() {
        System.out.println("\n--- Desktop Info ---");
        System.out.println("Branch: "+branchComp);
        System.out.println("IP: "+ip);
        System.out.println("Name: "+name);
    }
    
}
