package state.practice;

import java.util.Vector;

public class Computadora {
    private Vector<Programa> programasAbiertos = new Vector<>();
    public void addPrograma(Programa programa) {
        this.programasAbiertos.add(programa);
    }

    public void abrirProgramas(int n){
        System.out.println("ABRIENDO:");
        for(int i=0;i<n;i++){
            this.programasAbiertos.get(i).setEstadoPrograma("abierto");
            this.programasAbiertos.get(i).showPrograma();
        }
    }

    public void cierreProgramasAbiertos(){
        for(int i=0;i<programasAbiertos.size();i++){
            if(programasAbiertos.get(i).getEstadoPrograma().equals("abierto")){
                System.out.println("CERRANDO:");
                programasAbiertos.get(i).setEstadoPrograma("cerrado");
                programasAbiertos.get(i).showPrograma();
            }
        }
    }

    public void cierreTotalProgramas(){
        for(int i=0;i<programasAbiertos.size();i++){
            this.programasAbiertos.get(i).setEstadoPrograma("cerrado");
        }
    }

    public Vector<Programa> getProgramas(){
        return programasAbiertos;
    }
    
    public void estadoProgramas(){
        programasAbiertos.forEach(i->i.showPrograma());
    }

    private RAM ram;
    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }

    private CPU cpu;
    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Computadora(RAM ram, CPU cpu, Vector<Programa> programas) {
        this.ram = ram;
        this.cpu = cpu;
        this.programasAbiertos.addAll(programas);
        cierreTotalProgramas();
    }

    private IStateComp iStateComp;
    public IStateComp getStateComputer() {
        return iStateComp;
    }

    public void setStateComputer(IStateComp iStateComp) {
        this.iStateComp = iStateComp;
    }

    public void usarComputer(){
        this.iStateComp.comportamientoComp(this);
    }
}
