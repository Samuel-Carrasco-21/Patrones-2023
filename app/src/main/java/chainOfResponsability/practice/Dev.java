package chainOfResponsability.practice;

public class Dev implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reporteFalla(Persona persona, Falla falla) {
        if (falla.getSeveridad().toUpperCase().equals("CRITICA")){
            System.out.println("* El Dev resolvio la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println();
            System.out.println("Reportada por:");
            persona.showInfo();
        } else {
            System.out.println
            ("Exception: El Dev no se encuentra encargado de resolver la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println();
        }
    }
    
}
