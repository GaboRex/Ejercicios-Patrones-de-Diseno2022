package EjercicioObserver.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        Publicidad publi =new Publicidad();
        publi.attach(new UserTelefonia("PremiosPromos",new Persona("2321312322","Gabriel")));
        publi.attach(new UserTelefonia("Noticia",new Persona("4445454545","Giovanna")));
        publi.attach(new UserTelefonia("Todos",new Persona("21321321321","Samuel")));

        publi.notificaciones(new Notificaciones("1 Bs x minuto","carguita feliz para clientes nuevos","Susuki swift 2023", "Se cancela la doble carga de este mes ", "todos"));

    }
}
