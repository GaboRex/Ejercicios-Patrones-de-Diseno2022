package EjercicioCommand.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> comandos = new ArrayList<>();
    public Invoker(){
        System.out.println("\n******* START THE GAME *******\n");
    }
    public void addCommand(ICommand comando){
        comandos.add(comando);
    }
    public void runCommands(){
        for (ICommand comando : comandos) {
            comando.execute();
        }
        comandos.clear();
    }

}
