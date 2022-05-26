package EjercicioInterpreter.Ejercicio1;

public class Terminal0 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos un 0, lo mantenemos (output) */
    @Override
    public void interpreter(Contexto contexto) {
            if (contexto.input.startsWith("0")){
                contexto.output = contexto.output + "0";
                contexto.input = contexto.input.substring(1);
            }
    }
}
