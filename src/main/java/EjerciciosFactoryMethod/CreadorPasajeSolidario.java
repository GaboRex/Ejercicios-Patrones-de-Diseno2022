package EjerciciosFactoryMethod;

public class CreadorPasajeSolidario extends Creador {
    @Override
    public PasajeSolidario creandoProducto(Pasajero pasajero, int asiento) {

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

        PasajeSolidario pasajeSolidario = new PasajeSolidario(destino,origen,avion,pasajero);
        pasajeSolidario.setCosto(600);
        pasajeSolidario.setNumeroAsiento(asiento);
        pasajeSolidario.setNumeroVuelo(666);
        pasajeSolidario.setDescuento(200);
        pasajeSolidario.setMotivoDescuento("Adulto mayor");

        return pasajeSolidario;
    }
}
