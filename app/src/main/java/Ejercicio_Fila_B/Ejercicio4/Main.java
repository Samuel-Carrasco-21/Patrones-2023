package Ejercicio_Fila_B.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Operadora operadora = new Operadora();
        
        operadora.sContrato(new Amazon());
        operadora.createContrato();
        Contrato amazonContrato = operadora.gContrato();
        amazonContrato.showInfo();

        operadora.sContrato(new HBO());
        operadora.createContrato();
        Contrato hboContrato = operadora.gContrato();
        hboContrato.showInfo();

        operadora.sContrato(new Netflix());
        operadora.createContrato();
        Contrato netflixContrato = operadora.gContrato();
        netflixContrato.showInfo();
    }
}
