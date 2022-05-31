package EjercicioIterator.Ejercicio1;


import java.util.Stack;

public class ConcreteImportadora4 implements IAggregate {
        private Stack<Auto> listaAutos;

        public ConcreteImportadora4(){
            listaAutos = new Stack<Auto>();
        }

        public void add(Auto valor){
            listaAutos.push(valor);
        }

        @Override
        public Iterator createIterator() {
            return new ConcreteIteratorImportadora4(listaAutos);
        }
}
