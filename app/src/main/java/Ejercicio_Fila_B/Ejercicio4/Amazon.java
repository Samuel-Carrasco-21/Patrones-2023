package Ejercicio_Fila_B.Ejercicio4;

import java.util.Vector;

public class Amazon extends Builder{

    @Override
    public void buildCosto() {
        // TODO Auto-generated method stub
        contrato.setCosto(50);
    }

    @Override
    public void buildStartup() {
        // TODO Auto-generated method stub
        contrato.setEmpresa("AMAZON");
    }

    @Override
    public void buildListaCanales() {
        // TODO Auto-generated method stub
        Vector<String> peliculas = new Vector<>();
        peliculas.add("pelicula amazon 1");
        peliculas.add("pelicula amazon 2");
        peliculas.add("pelicula amazon 3");

        contrato.setListaCanales(peliculas);
    }
    
}
