package EjercicioCommand.Ejercicio1;

public class ModoDefensa implements ICommand{
    private Receiver receiver;

    public ModoDefensa(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.modoDefensa();
    }
}
