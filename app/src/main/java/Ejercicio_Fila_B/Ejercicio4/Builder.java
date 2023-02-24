package Ejercicio_Fila_B.Ejercicio4;

public abstract class Builder {
    protected Contrato contrato;

    public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public void generateContrato() {
		contrato = new Contrato();
	}

	public abstract void buildCosto();
	public abstract void buildStartup();
	public abstract void buildListaCanales();
}
