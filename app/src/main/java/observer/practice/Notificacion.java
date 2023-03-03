package observer.practice;

public class Notificacion {
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Notificacion(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public void showInfo(){
        System.out.println("--- OFERTA ---");
        System.out.println("Id: "+id);
        System.out.println("Tipo: "+tipo);
        System.out.println("--------------");
    }
}
