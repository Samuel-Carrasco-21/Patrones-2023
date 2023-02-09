package singleton.Practica;

public class Clientes {
    private String nombre;
    private int IDcliente;
    private boolean []codigosUsados = new boolean[101];
    private int contador=0;
    public String getNombre() {
        return nombre;
    }

    public Clientes(String nombre, int IDcliente){
        this.nombre = nombre;
        this.IDcliente = IDcliente;
    }

    public void escogerProducto(int IDProducto, int cantidad){
        Logger.getInstance().imprimir("Producto escogido: "+IDProducto+
            "\nCantidad de productos: "+cantidad);
        Factura factura = new Factura(this, this.IDcliente);
        
        int IDdescuento = generarRandom();
        float descuento = (float)(generarRandom());
        
        descuento = ((float)(descuento))/100;
        if(contador<100){
            if(!codigosUsados[IDdescuento]){
                codigosUsados[IDdescuento] = true;
                contador++;
                Logger.getInstance()
                .imprimir("Se aplicara un descuento de: "+descuento+"%");
            }else{
                Logger.getInstance().imprimir("No se aplicaran descuentos");
                descuento = 1;
            }
        }
        Promocion promocion = new 
            Promocion(IDdescuento, (float)(1) - descuento);
        factura.mostrarFactura();
        Logger.getInstance().ObtenerProducto(IDProducto, cantidad, promocion);
    }
    public int generarRandom(){
        int aux = (int)(Math.random()*100);
        return aux>1?aux:aux+1;
    }

}
