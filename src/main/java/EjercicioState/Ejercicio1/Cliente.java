package EjercicioState.Ejercicio1;

public class Cliente { public static void main (String[]args) throws InterruptedException {
    Computadora pc = new Computadora();
    pc.setState(new Encendido());
    /*
    En caso de querer usar los otros estados debemos comentar el pc.setState(new Encendido()); y descomentar uno de los otros estados.
     */
    //pc.setState(new Apagado());
    /*
    para apagar
     */
    //pc.setState(new Reinicio());
    /*
    para reinciar, todos funcionan:)
     */
    pc.resourceManager();
    }
}
