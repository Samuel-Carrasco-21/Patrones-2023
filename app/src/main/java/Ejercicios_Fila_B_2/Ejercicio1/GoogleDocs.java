package Ejercicios_Fila_B_2.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class GoogleDocs {
    int numeroVersion = 0;
    private Map<String,Memento> versionesArchivos = new HashMap<>();

    public void guardarVersion(Memento memento){
        int palabras = 1;
        boolean isWord = false;
        char []arreglo = 
        memento.getProjectState().getConenido().toLowerCase().toCharArray();
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]!=' '){
                isWord = true;
            }
            if(arreglo[i]==' ' && isWord){
                palabras++;
                isWord = false;
            }
        }
        if(palabras>=5){
            System.out.println("\n--- Versionando archivo ---");
            numeroVersion++;
            versionesArchivos.put("version"+numeroVersion, memento);
        }else{
            System.out.println("\n--- No es posible versionar el archivo ---");
        }
    }

    public Memento obtenerVersion(String version) throws Exception{
        version = version.toLowerCase();
        if ( !versionesArchivos.containsKey(version)){
            throw new Exception("\n--- Error - La version no existe ---");
        }
        System.out.println("\n--- Version Obtenida ---");
        System.out.println("* Version: "+version);
        System.out.println("* Archivo:");
        versionesArchivos.get(version).getProjectState().info();
        return versionesArchivos.get(version);
    }

}
