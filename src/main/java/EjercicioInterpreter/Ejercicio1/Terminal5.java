package EjercicioInterpreter.Ejercicio1;

public class Terminal5 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos un 5, lo mantenemos (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("5")){
            contexto.output = contexto.output + "V";
            contexto.input = contexto.input.substring(1);
        }
    }
}
