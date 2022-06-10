package EjercicioStrategy.Ejercicio1;

import java.util.List;

public class Primavera implements IEstacion {
    @Override
    public void descuento(List<Ropa> tienda) {
        System.out.println("\n ---- PRECIOS DE TEMPORADA ----\n");
        for (Ropa ropa: tienda) {
            ropa.setPrecioTemporada(ropa.getPrecioOriginal());
            ropa.mostrarInfo();

        }
    }
}
