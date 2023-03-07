package visitor.practice;

public interface IPersona {
    void cambioMoneda(Bolivia bolivia, int dinero, String tipoMoneda);
    void cambioMoneda(USA Usa, int dinero, String tipoMoneda);
    void cambioMoneda(Europa europa, int dinero, String tipoMoneda);
}
