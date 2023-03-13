package Ejercicios_Fila_B_2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        BD bd = new BD();
        bd.addEstudiantes(new Estudiante(
            generarRandom(),
            "jose",
            "sistemas"));
        bd.addEstudiantes(new Estudiante(
            generarRandom(),
            "adrian",
            "sistemas"));
        bd.addEstudiantes(new Estudiante(
            generarRandom(),
            "luis",
            "comunicacion"));
        bd.addEstudiantes(new Estudiante(
            generarRandom(),
            "vivian",
            "ambiental"));
        bd.addEstudiantes(new Estudiante(
            generarRandom(),
            "camila",
            "ambiental"));
        bd.addEstudiantes(new Estudiante(
            generarRandom(),
            "natalia",
            "comunicacion"));

        System.out.println("\n<><><><><>Estrategia 1<><><><><>");
        bd.setStrategy(new Estrategia1());
        bd.buscarEstudiantes();

        System.out.println("\n<><><><><>Estrategia 2<><><><><>");
        bd.setStrategy(new Estrategia2());
        bd.buscarEstudiantes();

        System.out.println("\n<><><><><>Estrategia 3<><><><><>");
        bd.setStrategy(new Estrategia3());
        bd.buscarEstudiantes();
    }

    public static int generarRandom(){
        return (int)(Math.random()*1000);
    }
}
