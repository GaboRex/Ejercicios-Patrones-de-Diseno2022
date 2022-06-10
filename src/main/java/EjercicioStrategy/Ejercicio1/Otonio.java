package EjercicioStrategy.Ejercicio1;

import java.util.List;

public class Otonio implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("\n ---- PRECIOS DE TEMPORADA - OTONIO ----\n");
        for (Ropa ropa: tienda) {
            int cantidad = ropa.getPrecioOriginal()*50/100;
            ropa.setPrecioTemporada(ropa.getPrecioOriginal() - cantidad);
            ropa.mostrarInfo();

        }
    }
}
