package Ejercicios_Fila_B_2.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Computadora compu = new Computadora();

        compu.setState(new Apagado());
        compu.accionar();
        compu.setState(new Prendido());
        compu.accionar();
        compu.setState(new Reinicio());
        compu.accionar();
        compu.setState(new Prendido());
        compu.accionar();
    }
}
