package EjercicioInterpreter.Ejercicio1;

public class Terminal3 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos un 0, lo mantenemos (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("3")){
            contexto.output = contexto.output + "III";
            contexto.input = contexto.input.substring(1);
        }
    }
}
