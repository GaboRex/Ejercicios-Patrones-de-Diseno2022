package EjercicioAdapter.Ejercicio1;

public class Tablet implements IEmpresa1 {
    private int precio;
    private int tiempoDeVida;

    public Tablet(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
        System.out.println(" El precio de la tablet es de: " + precio + "  Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println(" El tiempo de vida de la tablet es de: " + tiempoDeVida + " anios ");
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
    }
}
