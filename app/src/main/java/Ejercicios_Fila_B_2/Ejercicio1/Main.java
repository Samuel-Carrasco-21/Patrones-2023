package Ejercicios_Fila_B_2.Ejercicio1;

public class Main {
    static GoogleDocs googleDocs = new GoogleDocs();
    static Versionador versionador = new Versionador();
    static Archivo archivo = new Archivo(null, null, null);
    public static void main(String[] args) throws Exception {
        archivo.setNombre("Archivo 1");
        archivo.setVersion("Empresarial");

        sobrescribirArchivo("este documento es una prueba");
        sobrescribirArchivo("el exito solo depende de tu esfuerzo");
        sobrescribirArchivo("prologo");
        sobrescribirArchivo("este documento fue actualizado satisfactoriamente");

        cargarVersion("version1");
        cargarVersion("version2");
        cargarVersion("version3");
    }

    public static void sobrescribirArchivo(String contenido){
        archivo.setConenido(contenido);
        versionador.setArchivo(archivo);
        googleDocs.guardarVersion(versionador.guardado());
    }

    public static void cargarVersion(String version) throws Exception{
        archivo = 
        versionador
        .mostrarVersionArchivo(googleDocs.obtenerVersion(version));
    }
}
