package EjercicioAdapter.Ejercicio1;

public class Artefact implements IEmpresa1{
    private IEmpresa2 artefact;

    public Artefact(IEmpresa2 artefacto) {

        this.artefact = artefacto;
    }

    @Override
    public void mostrarPrecio() {

        artefact.mostrarCosto();
    }

    @Override
    public void mostrarTiempo() {

        artefact.mostrarGarantia();
    }
}
