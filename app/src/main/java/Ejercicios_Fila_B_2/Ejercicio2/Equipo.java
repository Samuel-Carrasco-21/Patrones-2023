package Ejercicios_Fila_B_2.Ejercicio2;

public abstract class Equipo {
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

    protected IChat chat;

    public Equipo(IChat chat) {
        this.chat = chat;
    }

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public Equipo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    private String alias;
    public String getAlias() {
        return alias;
    }
    public Equipo setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    private int rankins;
    public int getRankins() {
        return rankins;
    }
    public Equipo setRankins(int rankins) {
        this.rankins = rankins;
        return this;
    }

    public void showInfo(){
        System.out.println("--------- TEAM ----------");
        System.out.println("nombre: "+nombre);
        System.out.println("alias: "+alias);
        System.out.println("rankins: "+rankins);
        System.out.println("-------------------------");
    }
    
    public abstract void send(String msg, String tipoMensaje);
    public abstract void received(String msg);
    public abstract void infoPlayer();

}
