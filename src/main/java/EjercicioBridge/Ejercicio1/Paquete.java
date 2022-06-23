package EjercicioBridge.Ejercicio1;

public class Paquete {
    private int precio;
    private String nombre;

    public Paquete(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void showInfo(){
        System.out.println("Informacion del paquete");
        System.out.println("Nombre del paquete: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
