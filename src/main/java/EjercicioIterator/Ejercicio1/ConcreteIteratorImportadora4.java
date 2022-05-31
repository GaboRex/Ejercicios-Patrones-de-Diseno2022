package EjercicioIterator.Ejercicio1;


import java.util.Stack;


public class ConcreteIteratorImportadora4 implements  Iterator{
    private int posicion;
    private Stack<Auto> listaAutos;

    public ConcreteIteratorImportadora4(Stack<Auto> listaDeAutos) {
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
