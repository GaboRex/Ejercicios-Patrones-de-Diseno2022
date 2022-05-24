package EjerciciosFactoryMethod;

public class Pasajero {
    private String nombre;
    private int ci;
    private String ciudad;
    private String fechaNacimeinto;

    public Pasajero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimeinto() {
        return fechaNacimeinto;
    }

    public void setFechaNacimeinto(String fechaNacimeinto) {
        this.fechaNacimeinto = fechaNacimeinto;
    }
}
