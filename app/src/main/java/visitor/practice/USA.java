package visitor.practice;

public class USA implements IPais{

    private String nombre;
    private String monedaOficial;

    public USA() {
        this.nombre = "Estados Unidos";
        this.monedaOficial = "dolares";
    }

    @Override
    public void accept(IPersona iPersona, int dinero, String tipoMoneda) {
        iPersona.cambioMoneda(this,dinero,tipoMoneda);
    }

    @Override
    public void datosPais() {
        System.out.println("\n---- PAIS ----");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Moneda: "+monedaOficial);
        System.out.println("--------------");
    }

    
}
