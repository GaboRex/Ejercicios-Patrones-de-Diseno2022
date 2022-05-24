package EjerciciosFactoryMethod;

public class PasajeSolidario implements IPasaje {

    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;

    private int numeroVuelo;
    private int numeroAsiento;
    private int costo;
    private int descuento;
    private String motivoDescuento;


    public PasajeSolidario(Destino destino, Origen origen, Avion avion, Pasajero pasajero) {
        this.destino = destino;
        this.origen = origen;
        this.avion = avion;
        this.pasajero = pasajero;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumeroVuelo() {
        return numeroVuelo ;
    }

    public void setNumeroVuelo(int nroVuelo) {
        this.numeroVuelo = nroVuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" \n ****  INFORMACION DE TU PASAJE *** \n ");
        System.out.println("Tipo de pasaje: Solidario");
        System.out.println("Nombre del pasajero: " + pasajero.getNombre());
        System.out.println("Número de carnet: " + pasajero.getCi());
        System.out.println("Ciudad: " + pasajero.getCiudad());
        System.out.println("Número de vuelo: " + numeroVuelo);
        System.out.println("Número de asiento: " + numeroAsiento);
        System.out.println("Origen: " + origen.getAeropuerto() + ", " + origen.getCiudad());
        System.out.println("Destino: " + destino.getAeropuerto() + ", " + destino.getCiudad());
        System.out.println("Costo: " + costo);
        System.out.println("Descuento: " + descuento);
        System.out.println("Motivo del descuento: " + motivoDescuento);
    }
}
