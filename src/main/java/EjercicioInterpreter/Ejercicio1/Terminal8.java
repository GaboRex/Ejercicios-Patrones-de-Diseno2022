package EjercicioInterpreter.Ejercicio1;

public class Terminal8 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 8, lo reemplazamos por VIII (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("8")){
            contexto.output = contexto.output + "VIII";
            contexto.input = contexto.input.substring(1);
        }
    }
}
