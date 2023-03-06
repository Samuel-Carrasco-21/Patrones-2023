package state.practice;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("MA11");
        RAM ram = new RAM("X103");
        Vector<Programa> programas = new Vector<>();
        for(int i=0;i<20;i++){
            programas.add(
                new Programa("programa "+(i+1), 
                "cerrado"));
        }

        Computadora computadora = 
        new Computadora(ram, cpu, programas);

        computadora.setStateComputer(new Apagado());
        computadora.usarComputer();

        computadora.setStateComputer(new Prendido());
        computadora.usarComputer();

        computadora.setStateComputer(new Reinicio());
        computadora.usarComputer();

        computadora.setStateComputer(new Prendido());
        computadora.usarComputer();
    }
}
