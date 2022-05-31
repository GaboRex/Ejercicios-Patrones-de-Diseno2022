package EjercicioIterator.Ejercicio1;

import java.util.Vector;

public class ConcreteImportadora3 implements  IAggregate{
    private Vector<Auto> listaAutos;

    public ConcreteImportadora3(){
        listaAutos = new Vector<>();
    }

    public void add(Auto valor){
        listaAutos.add(valor);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora3(listaAutos);
    }
}
