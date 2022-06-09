package EjercicioState.Ejercicio1;

import java.net.InetSocketAddress;

public class Computadora {
    private Programas programas;
    private MemoriaRAM memoriaRam;
    private CPU cpu;
    private IStateCompu state;

    public Computadora(){
        memoriaRam = new MemoriaRAM();
        memoriaRam.setCapacidadUtilizada(5).setCapacidadTotal("16GB").setDescripcion("Memoria RAM");
        cpu = new CPU();
        cpu.setCapacidadUtilizada(5.0).setCapacidadTotal("64bits").setDescripcion("CPU");
        programas = new Programas();
        programas.setProgramasUtilizados("No hay programas en uso ");
        state = new Apagado();
    }

    public Programas getProgramas() {
        return programas;
    }

    public void setProgramas(Programas programas) {
        this.programas = programas;
    }

    public MemoriaRAM getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRAM memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public IStateCompu getState() {
        return state;
    }

    public void setState(IStateCompu state) {
        this.state = state;
    }

    public void resourceManager() throws InterruptedException {
        state.resourceManager(this);
    }
}
