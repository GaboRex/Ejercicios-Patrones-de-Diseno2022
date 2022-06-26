package EjercicioDecorator.Ejercicio1;

public class Seguro extends Funcionalidades {

    public Seguro(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        System.out.println("--- Pagando el seguro!");
        int nuevoSaldo = cuenta.getMonto() - 15;
        cuenta.setMonto(nuevoSaldo);
        super.showInfo();
    }
}
