package EjercicioComposite.Ejercicio1;

public class Computadora extends Component {

    public Computadora(String type){
        super(type);
    }

    @Override
    public void mostrarDetalles() {
        this.showInfo();
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }
}
