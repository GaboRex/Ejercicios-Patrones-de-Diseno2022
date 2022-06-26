package EjercicioDecorator.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        ICuenta cuentaBancaria = new CuentaBancaria(250, "Pablo Badani", false);
        cuentaBancaria.showInfo();

        cuentaBancaria = new Promo(cuentaBancaria);
        cuentaBancaria = new Seguro(cuentaBancaria);
        cuentaBancaria = new BancaInternet(cuentaBancaria);

        cuentaBancaria.showInfo();
    }
}

