package EjercicioIterator.Ejercicio1;

public class ConcreteImportadora1 implements  IAggregate{
    private int posicion;
    private Auto[] listaAutos;

    public ConcreteImportadora1(){
        listaAutos = new Auto[1];
    }

    public void add(Auto valor){
        listaAutos[posicion] = valor;
        posicion++;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIteratorImportadora1(listaAutos);
    }
}
