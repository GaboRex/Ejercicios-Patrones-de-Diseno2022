package EjercicioDecorator.Ejercicio1;

import java.util.Random;

public class Promo extends Funcionalidades {

    public Promo(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        int numeroRandom = new Random().nextInt(50);
        if(numeroRandom % 2 == 0){
            System.out.println("--- Felicidades! Gano un sorteo y se duplico su saldo!");
            int nuevoSaldo = 2 * cuenta.getMonto();
            cuenta.setMonto(nuevoSaldo);
            super.showInfo();
        } else {
            super.showInfo();
        }
    }
}
