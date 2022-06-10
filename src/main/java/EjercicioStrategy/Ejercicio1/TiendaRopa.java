package EjercicioStrategy.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TiendaRopa {
    private IEstacion estacion;
    private String nombre;
    private List<Ropa> listRopa = new ArrayList<>();


    public TiendaRopa(String nombre) {
        this.nombre = nombre;
    }

    public void addRopa(Ropa ropa){
        listRopa.add(ropa);
    }

    public void iniciarEstacion(){
        estacion.descuento(listRopa);
    }

    public void setEstacion(IEstacion estacion) {
        this.estacion = estacion;
    }
}
