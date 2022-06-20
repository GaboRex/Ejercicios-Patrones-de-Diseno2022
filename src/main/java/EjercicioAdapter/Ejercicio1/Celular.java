package EjercicioAdapter.Ejercicio1;

public class Celular implements IEmpresa1{
    private int precio;
    private int tiempoDeVida;

    public Celular(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showPrecio() {
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
        System.out.println("El precio del celular es de " + precio + " Bs");
    }

    @Override
    public void showTiempo() {
        System.out.println("El tiempo de vida del celular es de " + tiempoDeVida + " anios");
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
    }
}
