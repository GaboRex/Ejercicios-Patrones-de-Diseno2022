package EjercicioMediator.Ejercicio1;

public class Dev extends Personita{
    private String lenguaje;

    public Dev(IMediator mediator) {
        super(mediator);
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String mensaje) {
        mediator.send(mensaje,this);
    }

    @Override
    public void receive(String mensaje) {
        System.out.println("\n ------NUEVO MENSAJE-----\n");
        System.out.println("Nombre: " + getNombre() + ", Cargo: " + getCargo() + ", Lenguaje: " + lenguaje);
        System.out.println("Mensaje recibido: " + mensaje);

    }
}
