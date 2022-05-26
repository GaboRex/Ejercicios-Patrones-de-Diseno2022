package EjercicioInterpreter.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        String msg1 = "1 5";
        Interpreter parser1 = new Interpreter(msg1);
        System.out.println("Mensaje recibido: " + msg1);
        System.out.println("Mensaje interpretado: " + parser1.evaluateMsg());
        System.out.println();

        String msg2 = "1 2 3 4 5 6 7 8 9 10";
        Interpreter parser2 = new Interpreter(msg2);
        System.out.println("Mensaje recibido: " + msg2);
        System.out.println("Mensaje interpretado: " + parser2.evaluateMsg());
        System.out.println();

        String msg3 = "2 4 6 8 10";
        Interpreter parser3 = new Interpreter(msg3);
        System.out.println("Mensaje recibido: " + msg3);
        System.out.println("Mensaje interpretado: " + parser3.evaluateMsg());
        System.out.println();

        String msg4 = "0 1 3 5 7 9";
        Interpreter parser4 = new Interpreter(msg4);
        System.out.println("Mensaje recibido: " + msg4);
        System.out.println("Mensaje interpretado: " + parser4.evaluateMsg());
        System.out.println();
        }
    }
