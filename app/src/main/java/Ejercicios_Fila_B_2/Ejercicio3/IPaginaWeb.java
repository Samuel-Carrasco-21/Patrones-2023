package Ejercicios_Fila_B_2.Ejercicio3;

public interface IPaginaWeb {
    void attach (ISubscriptor observer);
    void deattach (ISubscriptor observer);
    void notifyObservers(String tipo);
}
