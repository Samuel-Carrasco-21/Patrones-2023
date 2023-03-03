package observer.practice;

import java.util.Vector;

public interface IUsuario {
    void actualizar(String message, Notificacion notificacion);
    void addTipoNotificacion(String tipoNotificacion);
    Vector<String> getTipoNotificacion();
}
