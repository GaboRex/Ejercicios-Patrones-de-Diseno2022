package EjercicioInterpreter.Ejercicio1;

public class Terminal9 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 9, lo reemplazamos por IV (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("9")){
            contexto.output = contexto.output + "IX";
            contexto.input = contexto.input.substring(1);
        }
    }
}
