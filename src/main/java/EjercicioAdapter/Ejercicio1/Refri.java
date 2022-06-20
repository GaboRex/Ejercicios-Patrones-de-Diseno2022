package EjercicioAdapter.Ejercicio1;

public class Refri implements IEmpresa2{
    private int precio;
    private int tiempoDeGarantia;

    public Refri(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void mostrarCosto() {
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
        System.out.println("El precio del refrigerador es de " + precio + " Bs");
    }

    @Override
    public void mostrarGarantia() {
        System.out.println("El tiempo de garantia del refrigerador es de " + tiempoDeGarantia + " anios");
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
    }
}
