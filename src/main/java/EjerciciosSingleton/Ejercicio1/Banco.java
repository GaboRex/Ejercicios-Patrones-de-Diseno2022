package EjerciciosSingleton.Ejercicio1;

public class Banco {
    private Persona persona;
    private String nombre;
    public Banco(Persona persona, String nombre) {
        this.persona = persona;
        this.nombre = nombre;
    }

    public void cambiarDivisaABanco(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
        System.out.println(persona.getNombre() + " Solicita cambiar divisas con el banco de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        SingletonTipoDeCambio.getInstance().cambioDivisa(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}
