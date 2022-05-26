package EjercicioInterpreter.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<AbstractExpression> grammar = new ArrayList<>();
    private Contexto contexto;

    public Interpreter(String msgToInterpret) {
        contexto = new Contexto(msgToInterpret);
        for (String charOriginal : msgToInterpret.split("")) {
            switch (charOriginal){
                case "0":
                    grammar.add(new Terminal0());
                    break;
                case "1":
                    grammar.add(new Terminal1());
                    break;
                case "2":
                    grammar.add(new Terminal2());
                    break;
                case "3":
                    grammar.add(new Terminal3());
                    break;
                case "4":
                    grammar.add(new Terminal4());
                    break;
                case "5":
                    grammar.add(new Terminal5());
                    break;
                case "6":
                    grammar.add(new Terminal6());
                    break;
                case "7":
                    grammar.add(new Terminal7());
                    break;
                case "8":
                    grammar.add(new Terminal8());
                    break;
                case "9":
                    grammar.add(new Terminal9());
                    break;
                case " ":
                    grammar.add(new TerminalEspacio());
                    break;
                default:
                    break;
            }
        }
    }
    public String evaluateMsg(){
        for (AbstractExpression expression:grammar) {
            expression.interpreter(contexto);
        }
        return contexto.output;
    }
}
