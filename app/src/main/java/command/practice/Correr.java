package command.practice;

public class Correr implements ICommand{
    private Personaje personaje;

    public Correr(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.correr();
    }
}
