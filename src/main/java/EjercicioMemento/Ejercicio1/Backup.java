package EjercicioMemento.Ejercicio1;

import java.util.List;

public class Backup {
    private List<Personita> state;

    public void setBackup(List<Personita> state){
        this.state = state;
    }

    public Memento createBackup(){
        return new Memento(state);
    }

    public List<Personita> restoreBackup(Memento m){
        System.out.println("\n-------RESTAURANDO BACKUP-------\n");
        this.state = m.getState();
        return this.state;
    }
}
