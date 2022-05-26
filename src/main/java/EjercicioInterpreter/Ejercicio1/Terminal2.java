package EjercicioInterpreter.Ejercicio1;

public class Terminal2 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 2, lo reemplazamos por II (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("2")){
            contexto.output = contexto.output + "II";
            contexto.input = contexto.input.substring(1);
        }
    }
}
