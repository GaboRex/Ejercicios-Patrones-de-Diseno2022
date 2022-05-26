package EjercicioInterpreter.Ejercicio1;

public class TerminalEspacio extends AbstractExpression{
    /* Si en el mensaje (input) encontramos un espacio, lo mantenemos (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith(" ")){
            contexto.output = contexto.output + " ";
            contexto.input = contexto.input.substring(1);
        }
    }
}
