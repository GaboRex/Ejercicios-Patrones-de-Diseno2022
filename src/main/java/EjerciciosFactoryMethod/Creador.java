package EjerciciosFactoryMethod;

public abstract class  Creador {
    public Creador(){
    }

    public abstract IPasaje creandoProducto(Pasajero pasajero, int asiento);
}
