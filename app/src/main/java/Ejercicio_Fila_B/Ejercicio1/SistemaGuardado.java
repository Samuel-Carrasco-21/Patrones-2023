package Ejercicio_Fila_B.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class SistemaGuardado {
    private static SistemaGuardado instance = null;
    private static List<Registro> tesisReg;

    private SistemaGuardado(){
        tesisReg = new ArrayList<>();
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new SistemaGuardado();
        }
    }

    // global access
    public static SistemaGuardado getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }

    public synchronized void registrarTesis(Tesis tesis, String hora, String tema){
        System.out.println("\nRegistrando Tesis:");
        Registro registro = new Registro();
        registro.setHora(hora);
        registro.setTesis(tesis);
        registro.setTema(tema);
        tesisReg.add((int) Math.random(), registro);
        mostrarRegistro(tesis, hora, tema);
    }

    public synchronized void mostrarRegistro(Tesis tesis, String hora, String tema){
        System.out.println("----------");
        System.out.println("Registro: ");
        System.out.println("* Hora: "+hora);
        System.out.println("* Tesis: ");
        System.out.println("** Estudiante: "+tesis.getEstudiante().getNombre());
        System.out.println("** CI Estudiante: "+tesis.getEstudiante().getCI());
        System.out.println("** Mencion: "+tesis.getMencion());
        System.out.println("** Titulo: "+tesis.getTitulo());
        System.out.println("** Tema Tesis: "+tema);
        System.out.println("----------");
    }

    public void tesisRegistradas(){
        if(tesisReg.size()==0){
            System.out.println("\nNO HAY TESIS REGISTRADAS");
        }else{
            System.out.println("\nTesis Registradas:");
            for(int i=0;i<tesisReg.size();i++){
                mostrarRegistro(
                    tesisReg.get(i).getTesis(),
                    tesisReg.get(i).getHora(),
                    tesisReg.get(i).getTema());
            }
        }
    }
}
