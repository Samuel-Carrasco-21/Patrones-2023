package Ejercicio_Fila_B.Ejercicio4;

import java.util.Vector;

public class Netflix extends Builder{

    @Override
    public void buildCosto() {
        // TODO Auto-generated method stub
        contrato.setCosto(150);
    }

    @Override
    public void buildStartup() {
        // TODO Auto-generated method stub
        contrato.setEmpresa("NETFLIX");
    }

    @Override
    public void buildListaCanales() {
        // TODO Auto-generated method stub
        Vector<String> peliculas = new Vector<>();
        peliculas.add("pelicula netflix 1");
        peliculas.add("pelicula netflix 2");
        peliculas.add("pelicula netflix 3");

        contrato.setListaCanales(peliculas);
    }
    
}
