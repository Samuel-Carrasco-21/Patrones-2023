package state.practice;

public class CPU {
    private String modelo;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int cantidadRecursosDisponibles;
    public int getCantidadRecursosDisponibles() {
        return cantidadRecursosDisponibles;
    }
    public void setCantidadRecursosDisponibles(int cantidadRecursosDisponibles) {
        if(cantidadRecursosDisponibles<=100 && cantidadRecursosDisponibles>=0){
            this.cantidadRecursosDisponibles = cantidadRecursosDisponibles;
        }else{
            System.out.println("--- Operacion inaceptable ---");
        }
    }

    public CPU(String modelo){
        this.modelo = modelo;
        this.cantidadRecursosDisponibles = 99;
    }

    public void showCpu(){
        System.out.println("----- CPU -----");
        System.out.println("* Modelo: "+modelo);
        System.out.println
        ("* Cantidad Recursos Disponibles: "
        +cantidadRecursosDisponibles);
        System.out.println("---------------");
    }
}
