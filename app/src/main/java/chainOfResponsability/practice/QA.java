package chainOfResponsability.practice;

public class QA implements IHandler{
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
        if (falla.getSeveridad().toUpperCase().equals("ALTA")){
            System.out.println("* El QA reviso la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println("Reportada por:");
            System.out.println();
            persona.showInfo();
        } else {
            System.out.println
            ("Exception: El QA no se encuentra encargado de revisar la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println("Se redirigira el reporte al encargado...");
            System.out.println();
            next.reporteFalla(persona, falla);
        }
    }
}
