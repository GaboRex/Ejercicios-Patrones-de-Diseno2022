package EjerciciosSingleton.Ejercicio1;

import java.text.SimpleDateFormat;

public class SingletonTipoDeCambio {

    // 2) attribute del mismo tipo, private, static
    private static SingletonTipoDeCambio singletonTipoDeCambio;
    private final int cambioSus = 7;
    private final int cambioEuro = 9;
    private final int cambioBs = 1;

    // 1) constructor private
    private SingletonTipoDeCambio(){
    }

    // 3) method public static - para el acceso global
    public static SingletonTipoDeCambio getInstance(){
     if (singletonTipoDeCambio==null)
         singletonTipoDeCambio= new SingletonTipoDeCambio();
     return singletonTipoDeCambio;
    }

    public void cambioDivisa(int cantidad, String tipoDivisaEntregada , String tipoDivisaACambiar){
        if (tipoDivisaEntregada.equals("Boliviano") && tipoDivisaACambiar.equals("Dolar")){
            cambiarBsASus(cantidad);
        } else if (tipoDivisaEntregada.equals("Dolar") && tipoDivisaACambiar.equals("Boliviano")) {
            cambiarSusABs(cantidad);
        } else if (tipoDivisaEntregada.equals("Boliviano") && tipoDivisaACambiar.equals("Euro")) {
            cambiarBsAEuros(cantidad);
        } else if (tipoDivisaEntregada.equals("Euro") && tipoDivisaACambiar.equals("Boliviano")) {
            cambiarEurosABs(cantidad);
        }else {
            System.out.println("Lo sentimos,no podemos procesar este tipo de cambio");
        }
    }

    public void cambiarBsASus(int Bs){
        int cambio = Bs/cambioSus;
        System.out.println("Bs: "+ Bs + "-----> " + "$: " + cambio);
    }

    public void cambiarBsAEuros(int Bs){
        int cambio = Bs*cambioEuro;
        System.out.println("Bs: "+ Bs + "-----> " + "€: " + cambio);
    }

    public void cambiarSusABs(int Sus){
        int cambio = cambioSus*Sus;
        System.out.println("$: "+ Sus + "-----> " + "Bs: " + cambio);
    }
    public void cambiarEurosABs(int Euro){
        int cambio = cambioEuro*Euro;
        System.out.println("€: "+ Euro + "-----> " + "Bs: " + cambio);
    }
}
