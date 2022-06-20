package EjercicioAdapter.Ejercicio1;

public class Compu implements IEmpresa1 {
    private int precio;
    private int tiempoDeVida;

    public Compu(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
        System.out.println("El precio de la computadora es de " + precio + " Bs");
    }

    @Override
    public void mostrarTiempo() {
        System.out.println("El tiempo de vida de la computadora es de " + tiempoDeVida + " anios");
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
    }
}
