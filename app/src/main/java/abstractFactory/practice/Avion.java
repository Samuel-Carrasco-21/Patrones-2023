package abstractFactory.practice;

public class Avion{
    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    private int capacidad;
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    private int numeroDeAsientos;
    public int getNumeroDeAsientos() {
        return numeroDeAsientos;
    }
    public void setNumeroDeAsientos(int numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }
    
    public void showInf(){
        System.out.println("Avion > marca: "+marca);
        System.out.println("Avion > capacidad: "+capacidad);
        System.out.println("Avion > modelo: "+modelo);
        System.out.println("Avion > numeroDeAsientos: "+numeroDeAsientos);
    }
}