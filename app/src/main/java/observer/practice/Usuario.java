package observer.practice;

import java.util.Vector;

public class Usuario implements IUsuario{
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
    
    public Usuario(String name, int ci) {
        this.name = name;
        this.ci = ci;
    }

    private Vector<String> tipoNotificaciones = new Vector<>();

    @Override
    public void addTipoNotificacion(String tipoNotificacion){
        tipoNotificaciones.add(tipoNotificacion.toLowerCase());
    }

    @Override
    public void actualizar(String message, Notificacion notificacion) {
        System.out.println("\n--- Notificacion nueva ---");
        System.out.println("A recibido una nueva notificacion de: "+message);
        System.out.println("* Dirigido a: "+name);
        System.out.println("* Ci: "+ci);
        notificacion.showInfo();
        System.out.println("--------------------------");
    }

    @Override
    public Vector<String> getTipoNotificacion() {
        return tipoNotificaciones;
    }

}
