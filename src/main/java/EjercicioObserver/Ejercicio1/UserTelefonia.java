package EjercicioObserver.Ejercicio1;

public class UserTelefonia implements IUser{
    String catalizador;
    Persona persona;

    public UserTelefonia(String notificacion, Persona persona) {
        this.catalizador = notificacion;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificaciones newNotificaciones) {
        System.out.println("\n ----- Notificacion:" + msg +" ----- \n");
        System.out.println("Persona: "+persona.getNombre());
        System.out.println("Preferencia: "+ catalizador);
        newNotificaciones.showInfo();
    }

    @Override
    public void update2(String msg, Notificaciones newNotificaciones) {
        System.out.println("\n ----- Notificacion:" + msg +" ----- \n");
        System.out.println("Persona: "+persona.getNombre());
        System.out.println("Preferencia: "+ catalizador);
        newNotificaciones.showInfo2();
    }

    @Override
    public void update3(String msg, Notificaciones newNotificaciones) {
        System.out.println("\n ----- Notificacion:" + msg +" ----- \n");
        System.out.println("Persona: "+persona.getNombre());
        System.out.println("Preferencia: "+ catalizador);
        newNotificaciones.showInfo3();
    }

    @Override
    public String getPreferenciaNotificaciones() {
        return catalizador;
    }

    public Persona getPersona() {
        return persona;
    }
}
