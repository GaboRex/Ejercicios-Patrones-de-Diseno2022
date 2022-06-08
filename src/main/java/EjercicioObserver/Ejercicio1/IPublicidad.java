package EjercicioObserver.Ejercicio1;

public interface IPublicidad {
    void attach(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Notificaciones notificaciones);
}

