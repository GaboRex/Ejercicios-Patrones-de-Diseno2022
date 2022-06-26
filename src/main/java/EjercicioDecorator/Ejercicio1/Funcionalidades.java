package EjercicioDecorator.Ejercicio1;

public class Funcionalidades implements ICuenta {
    protected ICuenta cuenta;

    public Funcionalidades(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void showInfo() {
        cuenta.showInfo();
    }

    @Override
    public void setMonto(int monto) {
        cuenta.setMonto(monto);
    }

    @Override
    public int getMonto() {
        return cuenta.getMonto();
    }

    @Override
    public void setBancaInternet(boolean bancaInternet) {

    }
}
