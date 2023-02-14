package abstractFactory.practice;

public class Pasajero{
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int ci;
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    
    public void showInf(){
        System.out.println("Pasajero > nombre: "+nombre);
        System.out.println("Pasajero > ci: "+ci);
    }
}