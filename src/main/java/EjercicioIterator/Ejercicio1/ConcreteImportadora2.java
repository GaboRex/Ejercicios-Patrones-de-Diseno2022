package EjercicioIterator.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteImportadora2 implements  IAggregate{
    private List<Auto> listaDeAutos;

    public ConcreteImportadora2(){
        listaDeAutos = new ArrayList<>();
    }

    public void add(Auto valor){
        listaDeAutos.add(valor);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora2(listaDeAutos);
    }
}
