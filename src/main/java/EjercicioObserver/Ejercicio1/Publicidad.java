package EjercicioObserver.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Publicidad implements IPublicidad {
    private List<Notificaciones> notificacionList= new ArrayList<>();
    private List<IUser> users= new ArrayList<>();

    public Publicidad() {
    }

    public void notificaciones(Notificaciones notificaciones){
        notificacionList.add(notificaciones);
        notifyObservers(notificaciones);
    }
    @Override
    public void attach(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(Notificaciones notificaciones) {
        for (IUser user:users ) {
            if (user.getPreferenciaNotificaciones().equals(notificaciones.getCatalizador())){
                user.update("nueva publicidad agregada",notificaciones);
            } else if(user.getPreferenciaNotificaciones().equals("premiosPromos")) {
                user.update2("nueva publicidad agregada",notificaciones);
            } else {
                user.update3("nueva publicidad agregada",notificaciones);
            }
        }
    }
}
