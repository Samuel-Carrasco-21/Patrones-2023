package command.practice;

public class Golpear implements ICommand{
    private Personaje personaje;

    public Golpear(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.golpear();
    }
    
}
