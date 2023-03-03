package observer.practice;

import java.util.Vector;

public class PropagandaPersonal implements IPropaganda{
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Vector<IUsuario> vectorUsuario = new Vector<>();
    private Vector<Notificacion> vectorOferta = new Vector<>();

    public Vector<Notificacion> getOfertaVector(){
        return vectorOferta;
    }

    public void enviarOferta(Notificacion notificacion){
        this.vectorOferta.add(notificacion);
        this.notificar(notificacion);
    }

    @Override
    public void agregarUsuario(IUsuario usuario, String tipoNotificacion) {
        if(tipoNotificacion.toLowerCase().equals("precios llamadas")
        ||tipoNotificacion.toLowerCase().equals("promosiones")
        ||tipoNotificacion.toLowerCase().equals("premios")
        ||tipoNotificacion.toLowerCase().equals("noticia")){
            if(!vectorUsuario.contains(usuario)){
                vectorUsuario.add(usuario);
            }
            if(!usuario.getTipoNotificacion().contains(tipoNotificacion.toLowerCase())){
                usuario.addTipoNotificacion(tipoNotificacion.toLowerCase());
            }
        }else{
            System.out.println("\n--- Notificacion invalida ---\n");
        }
    }

    @Override
    public void eliminarUsuario(IUsuario usuario) {
        vectorUsuario.remove(usuario);
    }

    @Override
    public void notificar(Notificacion notificacion) {
        for(int i=0;i<vectorUsuario.size();i++){
            boolean tipo = vectorUsuario.get(i)
            .getTipoNotificacion()
            .contains(notificacion.getTipo().toLowerCase());
            
            if(tipo){
                vectorUsuario.get(i)
                .actualizar(notificacion.getTipo().toLowerCase(),notificacion);
            }
        }
    }

}
