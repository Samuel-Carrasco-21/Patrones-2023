package memento.practice;

public class Personas {
    // Personas (name, ci, edad)
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    private int ci;
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }

    private int edad;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showInfo(){
        System.out.println("Nombre: "+this.getName());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Ci: "+this.getCi());
        System.out.println("-----------------");
    }

}
