package EjerciciosSingleton.Ejercicio1;

public class CasaDeCambio {
    private Persona persona;

    public CasaDeCambio(Persona persona) {
        this.persona = persona;
    }

    public void cambiarDivisaACasaDeCambio(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
        System.out.println(persona.getNombre() + " Solicita cambiar divisas en una casa de cambio de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        SingletonTipoDeCambio.getInstance().cambioDivisa(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}
