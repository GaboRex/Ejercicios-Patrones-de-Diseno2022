package EjercicioVisitor.Ejercicio1;

public class Italia implements IPais {
    private String moneda;
    private int monto;

    public Italia(){}

    @Override
    public void aceptar(IVisitante visitante) {
        visitante.cambiarDineroItalia(this);
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
