package decorator.practice;

import java.util.Vector;

public class Automovil implements IAutomovil{
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int precio;
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    private Vector<Accesorio> accVector = new Vector<>();

    public Automovil(String modelo, int precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public void agregarAccesorio(Accesorio accesorio){
        accesorio.decorarAutomovil(this);
    }
    
    @Override
    public void decorarAutomovil(IAutomovil iAutomovil) {
        System.out.println("<><><> Estableciendo Accesorio <><><>\n");
        Accesorio accesorio;
        accesorio = (Accesorio) iAutomovil;
        accVector.add(accesorio);
    }

    public void info(){
        System.out.println("* Modelo: "+modelo);
        System.out.println("* Precio: "+precio+"bs.");
        System.out.println("* Accesorios:");
        accVector.forEach(i -> i.infoAccesorio());
        System.out.println("<><><><><><><><><><><><>");
    }

    public void escogerAccion(int index){
        if(accVector.size()!=0 && index>=0 && index<accVector.size()){
            accVector.get(index).realizarAccion();
        }else{
            System.out.println("--- Comando Inaceptable ---");
        }
        
    }
    
}
