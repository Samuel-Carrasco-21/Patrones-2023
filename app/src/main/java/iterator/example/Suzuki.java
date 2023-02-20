package iterator.example;

import java.util.Vector;

public class Suzuki {
    private Vector<Automovil> automovils = new Vector<Automovil>();
    public Vector<Automovil> getAutomovils() {
        return automovils;
    }
    public void setAutomovils(Vector<Automovil> automovils) {
        this.automovils = automovils;
    }

    private String Sucursal;
    public String getSucursal() {
        return Sucursal;
    }
    public void setSucursal(String sucursal) {
        Sucursal = sucursal;
    }

    private String gerente;
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

}
