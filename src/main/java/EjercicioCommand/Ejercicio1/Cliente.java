package EjercicioCommand.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        //***************************************************************

        Disparar disparar = new Disparar(receiver);
        ModoDefensa defensa = new ModoDefensa(receiver);
        Atacar atacar = new Atacar(receiver);

//***************************************************************

        Invoker invoker = new Invoker();
        invoker.addCommand(disparar);
        invoker.addCommand(atacar);
        invoker.addCommand(defensa);
        invoker.addCommand(defensa);
        invoker.addCommand(atacar);
        invoker.runCommands();
    }
}

