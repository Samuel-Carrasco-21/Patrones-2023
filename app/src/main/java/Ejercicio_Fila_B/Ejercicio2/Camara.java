package Ejercicio_Fila_B.Ejercicio2;

public class Camara {
    private String foco;
    public String getFoco() {
        return foco;
    }
    public void setFoco(String foco) {
        this.foco = foco;
    }

    private String lente;
    public String getLente() {
        return lente;
    }
    public void setLente(String lente) {
        this.lente = lente;
    }

    public Camara(String foco, String lente) {
        this.foco = foco;
        this.lente = lente;
    }

    public void showInfo(){
        System.out.println("CAMARA:");
        System.out.println("Lente: "+lente);
        System.out.println("Foco: "+foco);
    }
    
}
