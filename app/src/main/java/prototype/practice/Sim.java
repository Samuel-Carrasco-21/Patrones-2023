package prototype.practice;

public class Sim {
    private String nombreEmpresaTel;
    public String getNombreEmpresaTel() {
        return nombreEmpresaTel;
    }
    private int numeroTelefono;
    public int getNumeroTelefono() {
        return numeroTelefono;
    }
    private Persona owner;
    public Persona getOwner() {
        return owner;
    }
    public Sim(String nombreEmpresaTel, int numeroTelefono, Persona owner) {
        this.nombreEmpresaTel = nombreEmpresaTel;
        this.numeroTelefono = numeroTelefono;
        this.owner = owner;
    }
}
