package EjercicioIterator.Ejercicio1;

import java.util.List;

public class ConcreteIteratorImportadora2 implements  Iterator{
    private int posicion;
    private List<Auto> listaAutos;

    public ConcreteIteratorImportadora2(List<Auto> listaDeAutos) {
        this.listaAutos = listaDeAutos;
        posicion = 0;
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
