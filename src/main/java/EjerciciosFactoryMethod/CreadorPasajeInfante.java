package EjerciciosFactoryMethod;

public class CreadorPasajeInfante extends Creador{
    @Override
    public PasajeInfantes creandoProducto(Pasajero pasajero, int asiento) {
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

        PasajeInfantes pasajeInfantes = new PasajeInfantes(destino, origen, avion, pasajero);
        pasajeInfantes.setTarifaPreferencial(400);
        pasajeInfantes.setNumeroAsiento(asiento);
        pasajeInfantes.setNumeroVuelo(666);

        return pasajeInfantes;
    }
}
