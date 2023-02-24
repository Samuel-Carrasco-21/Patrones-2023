package Ejercicio_Fila_B.Ejercicio4;

import java.util.Vector;

public class Contrato {
    private int costo;
    public double getCosto() {
		return costo;
	}
	public Contrato setCosto(int costo) {
		this.costo = costo;
        return this;
	}

    private String empresa;
	public String getEmpresa() {
		return empresa;
	}
	public Contrato setEmpresa(String empresa) {
		this.empresa = empresa;
        return this;
	}

    private Vector<String> listaCanales;
	public Vector<String> getListaCanales() {
		return listaCanales;
	}
	public Contrato setListaCanales(Vector<String> listaCanales) {
		this.listaCanales = listaCanales;
        return this;
	}

	public void showInfo() {
		System.out.println("\n--- CONTRATO ---");
		System.out.println("Costo: " + getCosto());
		System.out.println("Empresa: "+ getEmpresa());
		System.out.println("Peliculas:");
        for(int i=0;i<listaCanales.size();i++){
            System.out.println("Pelicula: "+listaCanales.get(i));
        }
		System.out.println("--------------");
	}
}
