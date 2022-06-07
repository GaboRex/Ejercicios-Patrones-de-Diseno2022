package EjercicioCommand.Ejercicio1;

public class Disparar implements ICommand{
    private Receiver receiver;

    public Disparar(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.disparar();
    }
}
