package Ejercicio_Fila_B.Ejercicio2;

public class Celular implements ICelular{

    private String modelo;
    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int tamano;
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    private int peso;
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    private Camara camara;
    public Camara getCamara() {
        return camara;
    }
    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    private String imei;
    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }

    private String paisCreado;
    public String getPaisCreado() {
        return paisCreado;
    }
    public void setPaisCreado(String paisCreado) {
        this.paisCreado = paisCreado;
    }

    public void showInfo(){
        System.out.println("\n--- CELULAR ---");
        System.out.println("* modelo: "+getModelo());
        System.out.println("* tamano: "+getTamano());
        System.out.println("* peso: "+getPeso());
        camara.showInfo();
        System.out.println("* imei: "+getImei());
        System.out.println("* pais origen: "+getPaisCreado());
    }

    @Override
    public Object clone(){
        Celular celular = new Celular();
        celular.setModelo(this.modelo);
        celular.setTamano(this.tamano);
        celular.setPeso(this.peso);
        celular.setCamara(this.camara);
        celular.setImei(this.imei);
        celular.setPaisCreado(this.paisCreado);
        return celular;
    }
    
}
