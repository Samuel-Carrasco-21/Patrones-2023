package command.practice;

public class Saltar implements ICommand{
    private Personaje personaje;

    public Saltar(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.saltar();
    }
}
