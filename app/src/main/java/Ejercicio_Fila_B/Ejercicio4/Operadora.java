package Ejercicio_Fila_B.Ejercicio4;

public class Operadora {
    private Builder builder;

    public Contrato gContrato(){
        return builder.getContrato();
    }

    public void sContrato(Builder builder){
        this.builder = builder;
    }

    public void createContrato(){
        this.builder.generateContrato();
        this.builder.buildCosto();
        this.builder.buildListaCanales();
        this.builder.buildStartup();
    }
}
