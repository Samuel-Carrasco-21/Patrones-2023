package chainOfResponsability.practice;

public class PO  implements IHandler{
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
        if (falla.getSeveridad().toUpperCase().equals("MEDIA")){
            System.out.println("* El PO reviso la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println();
            System.out.println("Reportada por:");
            persona.showInfo();
        } else {
            System.out.println
            ("Exception: El PO no se encuentra encargado de revisar la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println("Se redirigira el reporte al encargado...");
            System.out.println();
            next.reporteFalla(persona, falla);
        }
    }
}
