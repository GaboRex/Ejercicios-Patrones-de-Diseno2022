package EjercicioObserver.Ejercicio1;

public interface IUser {
    void update(String msg, Notificaciones newNotificaciones);
    void update2(String msg, Notificaciones newNotificaciones);
    void update3(String msg, Notificaciones newNotificaciones);
    String getPreferenciaNotificaciones();

}
