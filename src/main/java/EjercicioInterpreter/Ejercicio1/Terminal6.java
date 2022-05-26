package EjercicioInterpreter.Ejercicio1;

public class Terminal6 extends AbstractExpression{
    /* Si en el mensaje (input) encontramos el número 6, lo reemplazamos por VI (output) */
    @Override
    public void interpreter(Contexto contexto) {
        if (contexto.input.startsWith("6")){
            contexto.output = contexto.output + "VI";
            contexto.input = contexto.input.substring(1);
        }
    }
}

