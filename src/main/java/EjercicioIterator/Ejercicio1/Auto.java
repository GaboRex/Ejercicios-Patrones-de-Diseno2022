package EjercicioIterator.Ejercicio1;

public class Auto {
    private int costo;
    private String modelo;
    private int numeroAsientos;
    private String tipo;

    public Auto(int costo, String modelo, int numeroAsientos, String tipo) {
        this.costo = costo;
        this.modelo = modelo;
        this.numeroAsientos = numeroAsientos;
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
