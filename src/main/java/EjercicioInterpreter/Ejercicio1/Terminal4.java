package EjercicioInterpreter.Ejercicio1;

public class Terminal4 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 1, lo reemplazamos por I (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("4")){
            contexto.output = contexto.output + "IV";
            contexto.input = contexto.input.substring(1);
        }
    }
}
