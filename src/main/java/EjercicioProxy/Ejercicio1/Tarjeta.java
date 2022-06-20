package EjercicioProxy.Ejercicio1;

public class Tarjeta implements ICuenta {
    private CuentaBanco cuentaBancaria;

    public Tarjeta() {
        System.out.println("INICIANDO CUENTA CON 500 BS");
        cuentaBancaria = new CuentaBanco(500);
    }

    @Override
    public void realizarTransaccion(Transaccion transaccion) {
        if(transaccion.getMoneda().equals("bolivianos") && transaccion.getMonto()<=cuentaBancaria.getSaldo()){
            cuentaBancaria.realizarTransaccion(transaccion);
        } else if(transaccion.getMonto()>cuentaBancaria.getSaldo()){
            System.out.println("ERROR! Saldo insuficiente, revise la transaccion");
        } else {
            cuentaBancaria.realizarTransaccion(cuentaBancaria.cambiarABolivianos(transaccion));
        }
    }
}
