package EjercicioIterator.Ejercicio1;


import java.util.Vector;

public class ConcreteIteratorImportadora3 implements  Iterator{
    private int posicion;
    private Vector<Auto> listaAutos;

    public ConcreteIteratorImportadora3(Vector<Auto> listaDeAutos) {
        this.listaAutos = listaDeAutos;
    }

    @Override
    public Object next() {
        return listaAutos.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return listaAutos.size() != 0 && posicion < listaAutos.size();
    }
}
