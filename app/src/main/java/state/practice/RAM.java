package state.practice;

public class RAM {
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int porcentajeUso;
    public int getPorcentajeUso() {
        return porcentajeUso;
    }
    public void setPorcentajeUso(int porcentajeUso) {
        if(100>=porcentajeUso && porcentajeUso>=0){
            this.porcentajeUso = porcentajeUso;
        }else{
            System.out.println("--- Operacion inaceptable ---");
        }
    }

    public RAM(String modelo) {
        this.modelo = modelo;
        this.porcentajeUso = 1;
    }

    public void showRam(){
        System.out.println("----- RAM -----");
        System.out.println("* Modelo: "+modelo);
        System.out.println("* Porcentaje Uso: "+porcentajeUso);
        System.out.println("---------------");
    }
}
