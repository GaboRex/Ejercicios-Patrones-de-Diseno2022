package EjercicioMediator.Ejercicio1;

public class Sm extends Personita{
    private String certificaciones;

    public Sm(IMediator mediator) {
        super(mediator);
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public void send(String mensaje) {
        mediator.send(mensaje,this);
    }

    @Override
    public void receive(String mensaje) {
        System.out.println("\n ------NUEVO MENSAJE-----\n");
        System.out.println("Nombre: " + getNombre() + ", Cargo: " + getCargo() + ", Certificaciones: " + certificaciones);
        System.out.println("Mensaje recibido: " + mensaje);

    }
}
