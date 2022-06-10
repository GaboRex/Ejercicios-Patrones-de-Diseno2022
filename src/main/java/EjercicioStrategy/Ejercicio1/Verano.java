package EjercicioStrategy.Ejercicio1;

import java.util.List;

public class Verano implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("\n ---- PRECIOS DE TEMPORADA - INVIERNO ----\n");
        for (Ropa ropa: tienda) {
            int cantidad = ropa.getPrecioOriginal()*10/100;
            ropa.setPrecioTemporada(ropa.getPrecioOriginal() + cantidad);
            ropa.mostrarInfo();

        }
    }
}
