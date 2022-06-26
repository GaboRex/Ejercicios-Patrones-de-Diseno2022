package EjercicioDecorator.Ejercicio1;

public class CuentaBancaria implements ICuenta {
    private String propietario;
    private int monto;
    private boolean bancaInternet;

    public CuentaBancaria(int monto, String propietario, boolean bancaInternet) {
        this.monto = monto;
        this.propietario = propietario;
        this.bancaInternet = bancaInternet;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public void setBancaInternet(boolean bancaInternet) {
        this.bancaInternet = bancaInternet;
    }

    @Override
    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int getMonto() {
        return this.monto;
    }

    @Override
    public void showInfo() {
        System.out.println("INFORMACION DE LA CUENTA");
        System.out.println("Monto: " + monto);
        System.out.println("Propietario: " + propietario);
        System.out.println("Banca por internet: " + bancaInternet);
        System.out.println();
    }
}
