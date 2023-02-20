package iterator.example;

public class Automovil {
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    private String costo;
    public String getCosto() {
        return costo;
    }
    public void setCosto(String costo) {
        this.costo = costo;
    }

    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String numeroAsientos;
    public String getNumeroAsientos() {
        return numeroAsientos;
    }
    public void setNumeroAsientos(String numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Automovil(String id, String costo, String modelo, String numeroAsientos, String tipo) {
        this.id = id;
        this.costo = costo;
        this.modelo = modelo;
        this.numeroAsientos = numeroAsientos;
        this.tipo = tipo;
    }
}
