package proxy.practice;
 
public class Cuenta implements ITarjeta{
    private int dineroDiponible;
    public int getDineroDiponible() {
        return dineroDiponible;
    }

    private int number;
    public void setNumber(int number) {
        this.number = number;
    }

    private int pin;
    public void setPin(int pin) {
        this.pin = pin;
    }

    public Cuenta(){
        this.dineroDiponible = 100000;
    }

    @Override
    public void request(int dinero, String tipoModena, Producto producto) {
        dineroDiponible -= dinero;
        System.out.println("--- Compra exitosa ---");
        infoCuenta();
        producto.infoProducto();
    }

    private void infoCuenta(){
        System.out.println("--- Cuenta ---");
        System.out.println("* Dinero Disponible: "+dineroDiponible);
        System.out.println("* Numero Tarjeta: "+number);
        System.out.println("* Pin: "+pin);
    }

}