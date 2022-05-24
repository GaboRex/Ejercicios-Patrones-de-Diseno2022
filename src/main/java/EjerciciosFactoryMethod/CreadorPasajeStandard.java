package EjerciciosFactoryMethod;

public class CreadorPasajeStandard extends Creador {
    @Override
    public PasajeStandard creandoProducto(Pasajero pasajero, int asiento) {
        Destino destino = new Destino();
        destino.setAeropuerto("Barajas");
        destino.setCiudad("Madrid");
        destino.setPais("España");

        Origen origen = new Origen();
        origen.setAeropuerto("Viru Viru");
        origen.setCiudad("Santa Cruz");
        origen.setPais("Bolivia");

        Avion avion = new Avion();
        avion.setAerolinea("AVIANCA");
        avion.setModelo("Airbus A330");
        avion.setCapacidad(300);
        avion.setNumeroAsientos(300);

        PasajeStandard pasajeStandard = new PasajeStandard(destino,origen,avion,pasajero);
        pasajeStandard.setCosto(800);
        pasajeStandard.setNumeroAsiento(asiento);
        pasajeStandard.setNumeroVuelo(666);

        return pasajeStandard;
    }
}
