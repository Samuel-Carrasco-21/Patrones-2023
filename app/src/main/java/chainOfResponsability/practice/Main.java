package chainOfResponsability.practice;

public class Main {
    public static void main(String[] args) {
        EmpresaApp empresaApp = new EmpresaApp();
        Falla falla = new Falla();
        falla.setTitulo("Error de descarga");
        falla.setSeveridad("Baja");
        falla.setDescripcion("Paro constante de la descarga de la aplicacion cuando llega al 99%");
        empresaApp
        .reporteFalla(
            new Persona("Jose", "jsce2021@gmail.com", "JZan17")
            , falla);
    }
}
