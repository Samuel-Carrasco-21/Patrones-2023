package Ejercicios_Fila_B_2.Ejercicio1;

public class Versionador {
    private Archivo archivo;

    public void setArchivo(Archivo archivo){
        this.archivo = 
        new Archivo(
            archivo.getNombre(),
            archivo.getVersion(), 
            archivo.getConenido());
    }

    public Memento guardado(){
        return new Memento (this.archivo);
    }

    public Archivo mostrarVersionArchivo(Memento memento){
        this.archivo =memento.getProjectState();
        return this.archivo;
    }
}
