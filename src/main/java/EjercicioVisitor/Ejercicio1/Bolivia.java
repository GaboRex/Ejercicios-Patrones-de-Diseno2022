package EjercicioVisitor.Ejercicio1;

public class Bolivia implements IPais {
    private String moneda;
    private int monto;

    public Bolivia(){}

    @Override
    public void aceptar(IVisitante visitante) {
        visitante.cambiarDineroBolivia(this);
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
