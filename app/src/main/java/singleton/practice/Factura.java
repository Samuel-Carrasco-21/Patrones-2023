package singleton.practice;

public class Factura {
    private Clientes clientes;
    private int IDFactura;
    public int getIDFactura() {
        return IDFactura;
    }
    public Factura(Clientes clientes, int IDFactura){
        this.clientes = clientes;
        this.IDFactura = IDFactura;
    }
    public void mostrarFactura(){
        Logger.getInstance().imprimir("FACTURA:\nA nombre de: "+clientes.getNombre()+
            "\nID de factura: "+getIDFactura());
    }
}
