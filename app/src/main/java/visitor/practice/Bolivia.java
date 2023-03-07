package visitor.practice;

public class Bolivia implements IPais{

    private String nombre;
    private String monedaOficial;

    public Bolivia() {
        this.nombre = "Bolivia";
        this.monedaOficial = "bolivianos";
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
