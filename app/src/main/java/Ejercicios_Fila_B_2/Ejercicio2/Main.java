package Ejercicios_Fila_B_2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Docente d1 = new Docente(chat);
        Docente d2 = new Docente(chat);
        Docente d3 = new Docente(chat);

        d1.asignarAtributos(
            "docente 1",
            1094,
            "DOCENTES",
            "Profes",
            5);
        
        d2.asignarAtributos(
            "docente 2",
            2094,
            "DOCENTES",
            "Profes",
            5);

        d3.asignarAtributos(
            "docente 3",
            3094,
            "DOCENTES",
            "Profes",
            5);

        chat.addDocente(d1);
        chat.addDocente(d2);
        chat.addDocente(d3);

        Estudiante e1 = new Estudiante(chat);
        Estudiante e2 = new Estudiante(chat);
        Estudiante e3 = new Estudiante(chat);

        e1.asignarAtributos(
            "estudiante 1",
            5801,
            "EQUIPO",
            "The Boys",
            5);

        e2.asignarAtributos(
            "estudiante 2",
            6801,
            "EQUIPO",
            "The Boys",
            5);

        e3.asignarAtributos(
            "estudiante 3",
            7801,
            "EQUIPO",
            "The Boys",
            5);

        chat.addEstudiante(e1);
        chat.addEstudiante(e2);
        chat.addEstudiante(e3);

        e1.send("Hola Mundo", "todos");
        e1.send("Hola classmates", "estudiante");
    }
}
