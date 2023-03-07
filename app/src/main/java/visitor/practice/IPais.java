package visitor.practice;

public interface IPais {
    void accept(IPersona iPersona, int dinero, String tipoMoneda);
    void datosPais();
}
