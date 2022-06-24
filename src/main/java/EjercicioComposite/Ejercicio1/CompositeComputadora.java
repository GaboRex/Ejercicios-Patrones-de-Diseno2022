package EjercicioComposite.Ejercicio1;
import java.util.ArrayList;
import java.util.List;

    public class CompositeComputadora extends Component {
        private List<Component> componentList = new ArrayList<>();
        int precioTotal = 0;

        public CompositeComputadora(String tipo){
            super(tipo);
        }

        @Override
        public void mostrarDetalles() {
            System.out.println("- Composite > " + getTipo());
            for(Component c : componentList){
                c.mostrarDetalles();
                precioTotal = precioTotal+c.getPrecio();
            }
            //System.out.println(precioTotal);
            if(this.getTipo().startsWith("Laboratorio")){
                this.setPrecio(precioTotal);
                System.out.println("PRECIO TOTAL DEL LABORATORIO > " + precioTotal + " $");
            } else if(this.getTipo().startsWith("Contenedor")){
                this.setPrecio(precioTotal);
                System.out.println("PRECIO TOTAL DEL CONTENEDOR > " + precioTotal + " $");
            }

        }

        @Override
        public void add(Component component) {
            componentList.add(component);
        }

        @Override
        public void remove(Component component) {
            componentList.remove(component);
        }
}
