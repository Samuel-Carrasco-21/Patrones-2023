package chainOfResponsability.practice;

public class EmpresaApp implements IHandler{
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
    public void reporteFalla(Persona persona,Falla falla) {
        EquipoSoporte equipoSoporte = new EquipoSoporte();
        PO po = new PO();
        QA qa = new QA();
        Dev dev = new Dev();

        this.setNext(equipoSoporte);
        equipoSoporte.setNext(po);
        po.setNext(qa);
        qa.setNext(dev);

        System.out.println("\nBIENVENIDO");
        System.out.println("--- Sistema de reporte de fallas ---");
        System.out.println("Titulo: "+falla.getTitulo());
        System.out.println("Severidad: "+falla.getSeveridad());
        System.out.println("Descripcion:");
        System.out.println("* "+falla.getDescripcion());
        System.out.println();
        this.next.reporteFalla(persona,falla);

    }
}
