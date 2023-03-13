package Ejercicios_Fila_B_2.Ejercicio2;

public class Docente extends Equipo{

    public void asignarAtributos(
        String name,
        int ci,
        String nombre,
        String alias,
        int rankins){

        setName(name);
        setCi(ci);
        setNombre(nombre);
        setAlias(alias);
        setRankins(rankins);
    }

    public Docente(IChat chat) {
        super(chat);
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        tipoMensaje = tipoMensaje.toLowerCase();
        this.chat.send(msg, tipoMensaje, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("\n--- Mensaje Nuevo ---");
        System.out.println(">Para:");
        infoPlayer();
    }

    @Override
    public void infoPlayer() {
        System.out.println("---- Jugador--Docente ----");
        System.out.println("* nombre: "+getName());
        System.out.println("* ci: "+getCi());
        System.out.println("* TEAM:");
        showInfo();
        System.out.println("--------------------------");
    }
    
}
