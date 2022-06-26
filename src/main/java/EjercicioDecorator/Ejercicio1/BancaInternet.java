package EjercicioDecorator.Ejercicio1;

public class BancaInternet extends Funcionalidades{
    public BancaInternet(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        System.out.println("+++++++ Habilitando banca por internet! +++++++");
        cuenta.setBancaInternet(true);
        super.showInfo();
    }
}
