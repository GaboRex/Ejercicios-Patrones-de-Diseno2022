package EjercicioInterpreter.Ejercicio1;

public class Terminal7 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 7, lo reemplazamos por VII (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("7")){
            contexto.output = contexto.output + "VII";
            contexto.input = contexto.input.substring(1);
        }
    }
}
