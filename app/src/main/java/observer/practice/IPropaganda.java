package observer.practice;

public interface IPropaganda {
    void agregarUsuario(IUsuario usuario, String tipoNotificacion);
    void eliminarUsuario(IUsuario usuario);
    void notificar(Notificacion notificacion);
}
