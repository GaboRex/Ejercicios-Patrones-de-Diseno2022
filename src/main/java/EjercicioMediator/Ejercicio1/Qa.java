package EjercicioMediator.Ejercicio1;

public class Qa extends Personita{
    private String grado;

    public Qa(IMediator mediator) {
        super(mediator);
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void send(String mensaje) {
        mediator.send(mensaje,this);
    }

    @Override
    public void receive(String mensaje) {
        System.out.println("\n ------NUEVO MENSAJE-----\n");
        System.out.println("Nombre: " + getNombre() + ", Cargo: " + getCargo() + ", Grado: " + grado);
        System.out.println("Mensaje recibido: " + mensaje);

    }
}
