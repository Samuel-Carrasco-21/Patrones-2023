package Ejercicio_Fila_B.Ejercicio1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JefeRecursosHumanos jefeRecursosHumanos = new JefeRecursosHumanos();
                jefeRecursosHumanos.setNombre("Jhon Snow");

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {

                Estudiante estudiante = new Estudiante("Vivian", 34524);

                Tesis tesis = new Tesis();
                tesis.setEstudiante(estudiante);
                tesis.setMencion("Honorifica");
                tesis.setTitulo("Entscheidungs problem");

                jefeRecursosHumanos
                .registrarTesis(tesis, "14:00", "Ing. Sistemas");
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {

                Estudiante estudiante = new Estudiante("Ander", 39184);

                Tesis tesis = new Tesis();
                tesis.setEstudiante(estudiante);
                tesis.setMencion("Honorifica");
                tesis.setTitulo("NP Problems");

                jefeRecursosHumanos
                .registrarTesis(tesis, "15:00", "Ing. Sistemas");
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {

                Estudiante estudiante = new Estudiante("Jose", 93471);

                Tesis tesis = new Tesis();
                tesis.setEstudiante(estudiante);
                tesis.setMencion("De Grado");
                tesis.setTitulo("SubsetSum Problem");

                jefeRecursosHumanos
                .registrarTesis(tesis, "16:00", "Informatica");
            }
        });

        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {

                Estudiante estudiante = new Estudiante("Enrique", 48173);

                Tesis tesis = new Tesis();
                tesis.setEstudiante(estudiante);
                tesis.setMencion("De Grado");
                tesis.setTitulo("Travelling Salesman Problem");

                jefeRecursosHumanos
                .registrarTesis(tesis, "17:00", "Ing. Industrial");
            }
        });

        Thread user1_duplicado = new Thread(new Runnable() {
            @Override
            public void run() {

                Estudiante estudiante = new Estudiante("Vivian", 34524);

                Tesis tesis = new Tesis();
                tesis.setEstudiante(estudiante);
                tesis.setMencion("Honorifica");
                tesis.setTitulo("Entscheidungs problem");

                jefeRecursosHumanos
                .registrarTesis(tesis, "14:00", "Ing. Sistemas");
            }
        });

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user1_duplicado.start();
        Thread.sleep(2000);

        SistemaGuardado.getInstance().tesisRegistradas();

    }
}
