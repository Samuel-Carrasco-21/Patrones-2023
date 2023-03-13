package Ejercicios_Fila_B_2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        PaginaWeb paginaWeb = new PaginaWeb();
        for(int i=0;i<3;i++){
            Subscriptor subscriptor = new Subscriptor("video","persona "+i);
            paginaWeb.attach(subscriptor);
        }
        for(int i=0;i<2;i++){
            Subscriptor subscriptor = new Subscriptor("","persona "+(i+10));
            paginaWeb.attach(subscriptor);
        }

        paginaWeb.notifyObservers("video");
        paginaWeb.notifyObservers("imagen");
    }
}
