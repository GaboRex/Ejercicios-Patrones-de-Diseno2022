package EjercicioMediator.Ejercicio1;

public abstract class Personita {
    protected IMediator mediator;
    private String nombre;
    private String ci;
    private String cargo;

    public Personita(IMediator mediator) {
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract void send (String mensaje);
    public abstract void receive(String mensaje);
}
