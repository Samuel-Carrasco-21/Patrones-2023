package proxy.practice;

public class TarjetaProxy implements ITarjeta{

    private Cuenta cuenta = new Cuenta();

    public TarjetaProxy(int number, int pin){
        cuenta.setNumber(number);
        cuenta.setPin(pin);
    }

    @Override
    public void request(int dinero, String tipoModena, Producto producto) {
        System.out.println("--- Proxy Tarjeta ---");
        tipoModena = tipoModena.toLowerCase();
        if(tipoModena.equals("bolivianos")){
            System.out.println("--- Accediendo a Cuenta ---");
            if(dinero<=cuenta.getDineroDiponible() && dinero>= producto.getPrecio()){
                this.cuenta.request(dinero, tipoModena, producto);
            }else{
                System.out.println("--- OPERACION INACEPTABLE ---");
            }
        }else{
            System.out.println("--- Realizando Cambio moneda ---");
            if(tipoModena.equals("dolares")){
                dinero = dinero*7;
            }else if(tipoModena.equals("euros")){
                this.cuenta.request(dinero*8, tipoModena,producto);
                dinero = dinero*8;
            }else{
                dinero = dinero*((int)(Math.random()*10));
            }
            System.out.println("--- Accediendo a Cuenta ---");
            if(dinero<=cuenta.getDineroDiponible() && dinero>= producto.getPrecio()){
                this.cuenta.request(dinero, tipoModena, producto);
            }else{
                System.out.println("--- OPERACION INACEPTABLE ---");
            }
        }
    }
    
}
