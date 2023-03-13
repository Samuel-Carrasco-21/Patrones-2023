package adapter.practice;

public class Escritorio implements IComputadora{
    private String branchComp;
    private String ip;
    private String name;

    public Escritorio(String name){
        this.name = name;
        this.branchComp = "Electron";
        this.ip = "B"+((int)(Math.random()*100000))+"A";
    }

    @Override
    public void iniciarSesion() {
        System.out.println("\n--- Start Sesion ---");
        System.out.println("Desktop Login");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("\n--- End Sesion ---");
        System.out.println("Desktop Close");
    }

    @Override
    public void generarDatos() {
        System.out.println("\n--- Generate ---");
        System.out.println("Desktop Generator");
    }

    @Override
    public void infoComp() {
        System.out.println("\n--- Desktop Info ---");
        System.out.println("Branch: "+branchComp);
        System.out.println("IP: "+ip);
        System.out.println("Name: "+name);
    }
    
}
