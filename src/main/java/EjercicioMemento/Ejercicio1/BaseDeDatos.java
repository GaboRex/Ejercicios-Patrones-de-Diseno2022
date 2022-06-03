package EjercicioMemento.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String, Memento> personitas = new HashMap<>();

    public void createBackup(String alias, Memento m){
        personitas.put(alias, m);
    }

    public Memento getCommit(String alias){
        return personitas.get(alias);
    }
}
