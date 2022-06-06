package EjercicioChainResponsability.Ejercicio1;

public class Persona {
    private String ci;
    private String nombre;
    private int edad;

    public Persona(String ci, String nombre, int edad) {
        this.ci = ci;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
