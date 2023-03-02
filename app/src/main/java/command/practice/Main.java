package command.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Player One", 150, 125, 100);
        Correr correr = new Correr(personaje);
        Curarse curarse = new Curarse(personaje);
        Golpear golpear = new Golpear(personaje);
        Protegerse protegerse = new Protegerse(personaje);
        Saltar saltar = new Saltar(personaje);

        GenerarComando generarComando = new GenerarComando();

        List<ICommand> level1 = new ArrayList<>();
        level1.add(correr);
        generarComando
        .agregarComandos("Correr", level1);

        List<ICommand> level2 = new ArrayList<>();
        level2.add(protegerse);
        level2.add(curarse);
        generarComando
        .agregarComandos("accion regeneracion", level2);

        List<ICommand> level3 = new ArrayList<>();
        level3.add(saltar);
        level3.add(correr);
        level3.add(golpear);
        generarComando
        .agregarComandos("accion atacar", level3);

        List<ICommand> level4 = new ArrayList<>();
        level4.add(correr);
        level4.add(saltar);
        level4.add(correr);
        level4.add(saltar);
        level4.add(protegerse);
        level4.add(golpear);
        level4.add(curarse);
        level4.add(correr);
        generarComando.agregarComandos("contraAtaque", level4);

        personaje.showInfo();

        generarComando.runCommands("correr");
        generarComando.runCommands("accion regeneracion");
        generarComando.runCommands("accion atacar");
        generarComando.runCommands("contraAtaque");

        personaje.showInfo();
    }
}
