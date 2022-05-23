package EjerciciosSingleton.Ejercicio1;

import java.text.SimpleDateFormat;

public class LibreCambista {
        private final Persona persona;

        public LibreCambista(Persona persona) {
                this.persona = persona;
        }

        public void cambiarDivisaLibrecambista(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
                System.out.println(persona.getNombre() + " Solicita cambiar divisas con un libre cambista de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
                SingletonTipoDeCambio.getInstance().cambioDivisa(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
                System.out.println();
        }
}