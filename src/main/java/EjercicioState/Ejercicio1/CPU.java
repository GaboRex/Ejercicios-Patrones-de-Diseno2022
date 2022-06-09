package EjercicioState.Ejercicio1;

public class CPU {
    private String capacidadTotal;
    private double capacidadUtilizada;
    private String descripcion;

    public CPU(){}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public CPU setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public double getCapacidadUtilizada() {
        return capacidadUtilizada;
    }

    public CPU setCapacidadUtilizada(double capacidadUtilizada) {
        this.capacidadUtilizada = capacidadUtilizada;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public CPU setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public void showInfo(){
        System.out.println("\n---- INFO CPU ----\n");
        System.out.println("Capacidad Total: " + capacidadTotal);
        System.out.println("Capacidad Utilizada: " + capacidadUtilizada);
        System.out.println("Descripcion: " + descripcion);
    }
}
