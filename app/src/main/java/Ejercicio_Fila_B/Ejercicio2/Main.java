package Ejercicio_Fila_B.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setPeso(60);
        celular.setImei("10001");
        celular.setPaisCreado("Bolivia");
        celular.setCamara(new Camara("10", "5mp"));
        celular.setTamano(6);

        Celular c2 = (Celular) celular.clone();
        Celular c3 = (Celular) celular.clone();
        Celular c4 = (Celular) celular.clone();
        Celular c5 = (Celular) celular.clone();
        Celular c6 = (Celular) celular.clone();
        
        c2.setImei("10002");
        c3.setImei("10003");
        c4.setImei("10003");
        c5.setImei("10002");
        c6.setImei("10003");

        celular.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();
        c6.showInfo();

    }
}
