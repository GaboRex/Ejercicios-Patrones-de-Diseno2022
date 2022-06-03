package EjercicioMemento.Ejercicio1;

import java.util.List;

public class Memento {
    private List<Personita> state;

    public Memento(List<Personita> persona) {
        state = persona;
    }

    public List<Personita> getState(){
        return state;
    }



}
