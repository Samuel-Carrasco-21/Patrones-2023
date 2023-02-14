package prototype.practice;

public class Accesorios {
    private String audifonos;
    public String getAudifonos() {
        return audifonos;
    }
    private String cargador;
    public String getCargador() {
        return cargador;
    }
    private String estuche;
    public String getEstuche() {
        return estuche;
    }
    public Accesorios(String audifonos, String cargador, String estuche) {
        this.audifonos = audifonos;
        this.cargador = cargador;
        this.estuche = estuche;
    }

}
