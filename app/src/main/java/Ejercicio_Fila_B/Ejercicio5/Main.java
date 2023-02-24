package Ejercicio_Fila_B.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        String msg = "10 / 2 + 5 + 5 + 5";
        Evaluador evaluador = new Evaluador(msg);
        System.out.println("resultado final: "+evaluador.evaluateFormula());
    }
}
