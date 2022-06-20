package EjercicioAdapter.Ejercicio1;

public class Tv implements IEmpresa2 {
    private int precio;
    private int tiempoDeGarantia;

    public Tv(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showCosto() {
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
        System.out.println("El precio del televisor es de " + precio + " Bs");
    }

    @Override
    public void showTiempoDeGarantia() {
        System.out.println("El tiempo de garantia del televisor es de " + tiempoDeGarantia + " anios");
        System.out.println("\n ***************************************************************************************************************************************************************************\n");
    }
}
