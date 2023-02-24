package Ejercicio_Fila_B.Ejercicio4;

import java.util.Vector;

public class HBO extends Builder{
    @Override
    public void buildCosto() {
        // TODO Auto-generated method stub
        contrato.setCosto(100);
    }

    @Override
    public void buildStartup() {
        // TODO Auto-generated method stub
        contrato.setEmpresa("HBO");
    }

    @Override
    public void buildListaCanales() {
        // TODO Auto-generated method stub
        Vector<String> peliculas = new Vector<>();
        peliculas.add("pelicula hbo 1");
        peliculas.add("pelicula hbo 2");
        peliculas.add("pelicula hbo 3");

        contrato.setListaCanales(peliculas);
    }
}
