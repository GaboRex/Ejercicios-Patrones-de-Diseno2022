package EjercicioIterator.Ejercicio1;

public class ConcreteIteratorImportadora1  implements  Iterator{
    private int posicion;
    private Auto[] listaDeAutos;

    public ConcreteIteratorImportadora1(Auto[] listaDeAutos) {
        this.listaDeAutos = listaDeAutos;
    }

    @Override
    public Object next() {
        return listaDeAutos[posicion++];
    }
    @Override
    public boolean hasNext() {
        return listaDeAutos.length != 0 && posicion < listaDeAutos.length;
    }
}
