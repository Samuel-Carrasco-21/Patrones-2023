package Ejercicios_Fila_B_2.Ejercicio2;

import java.util.Vector;

public class Chat implements IChat{
    private Vector<Estudiante> estudiantes = new Vector<>();
    private Vector<Docente> docentes = new Vector<>();

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void removeEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }

    public void addDocente(Docente docente){
        docentes.add(docente);
    }

    public void removeDocente(Docente docente){
        docentes.remove(docente);
    }
    
    @Override
    public void send(String message, String tipoMensaje, Equipo equipo) {
        System.out.println("<><><><><><><>ENVIANDO MENSAJE<><><><><><><>");
        if(tipoMensaje.equals("estudiante")){
            estudiantes.stream()
            .filter(i->!i.getName().toLowerCase()
                .equals(equipo.getName().toLowerCase())
            ).forEach(i -> i.received(message));
        }else if(tipoMensaje.equals("docente")){
            docentes.stream()
            .filter(i->!i.getName().toLowerCase()
                .equals(equipo.getName().toLowerCase())
            ).forEach(i -> i.received(message));
        }else{
            estudiantes.stream()
            .filter(i->!i.getName().toLowerCase()
                .equals(equipo.getName().toLowerCase())
            ).forEach(i -> i.received(message));

            docentes.stream()
            .filter(i->!i.getName().toLowerCase()
                .equals(equipo.getName().toLowerCase())
            ).forEach(i -> i.received(message));
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
    }
    
}
