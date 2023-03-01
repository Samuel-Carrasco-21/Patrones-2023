package chainOfResponsability.practice;

public class EquipoSoporte  implements IHandler{
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
        if (falla.getSeveridad().toUpperCase().equals("BAJA")){
            System.out.println("* El equipo de soporte evaluo y reviso la falla de prioridad: "+falla.getSeveridad().toUpperCase());
            System.out.println();
            System.out.println("Reportada por:");
            persona.showInfo();
        } else {
            System.out.println
            ("Exception: El equipo de soporte no se encuentra encargado de evaluar y revisar la falla de prioridad: "
            +falla.getSeveridad().toUpperCase());
            System.out.println("Se redirigira el reporte al encargado...");
            System.out.println();
            next.reporteFalla(persona, falla);
        }
    }
}
