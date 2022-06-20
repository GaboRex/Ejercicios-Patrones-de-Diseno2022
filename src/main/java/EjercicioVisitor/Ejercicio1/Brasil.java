package EjercicioVisitor.Ejercicio1;

public class Brasil implements IPais {
    private String moneda;
    private int monto;

    public Brasil(){}

    @Override
    public void aceptar(IVisitante visitante) {
        visitante.cambiarDineroBrasil(this);
    }

    @Override
    public void setCambio(int monto, String moneda) {
        this.moneda = moneda;
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public int getMonto() {
        return monto;
    }
}
