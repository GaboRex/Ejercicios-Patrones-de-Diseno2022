package EjercicioInterpreter.Ejercicio1;

public class Terminal1 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 1, lo reemplazamos por I (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("1")){
            contexto.input = contexto.input.substring(1);
            if (contexto.input.startsWith("0")){
                contexto.output = contexto.output + "X";
                contexto.input = contexto.input.substring(1);
            } else {
                contexto.output = contexto.output + "I";
            }
        }
    }
}
