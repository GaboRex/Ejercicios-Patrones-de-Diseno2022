package EjercicioState.Ejercicio1;

public class MemoriaRAM {
    private String capacidadTotal;
    private int capacidadUtilizada;
    private String descripcion;

    public MemoriaRAM(){}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public MemoriaRAM setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public int getCapacidadUtilizada() {
        return capacidadUtilizada;
    }

    public MemoriaRAM setCapacidadUtilizada(int capacidadUtilizada) {
        this.capacidadUtilizada = capacidadUtilizada;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public MemoriaRAM setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public void showInfo(){
        System.out.println("\n---- INFO RAM ----\n");
        System.out.println("Capacidad Total: " + capacidadTotal);
        System.out.println("Capacidad Utilizada: " + capacidadUtilizada);
        System.out.println("Descripcion: " + descripcion);
    }
}
