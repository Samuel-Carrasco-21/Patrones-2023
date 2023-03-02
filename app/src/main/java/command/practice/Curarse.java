package command.practice;

public class Curarse implements ICommand{
    private Personaje personaje;

    public Curarse(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.curarse();    
    }
    
}
