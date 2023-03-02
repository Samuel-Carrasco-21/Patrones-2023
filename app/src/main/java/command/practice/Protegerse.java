package command.practice;

public class Protegerse implements ICommand{
    private Personaje personaje;

    public Protegerse(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.protegerse();
    }
    
}
