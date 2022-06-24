package EjercicioComposite.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        CompositeComputadora l1 = new CompositeComputadora("Laboratorio1");
        l1.add(new Computadora("Computadora1").setPrecio(300));
        l1.add(new Computadora("Computadora2").setPrecio(300));
        l1.add(new Computadora("Computadora3").setPrecio(300));

        CompositeComputadora l2 = new CompositeComputadora("Laboratorio2");
        l2.add(new Computadora("Computadora4").setPrecio(500));
        l2.add(new Computadora("Computadora5").setPrecio(500));
        l2.add(new Computadora("Computadora6").setPrecio(500));
        l2.add(new Computadora("Computadora7").setPrecio(500));

        CompositeComputadora cont1 = new CompositeComputadora("Contenedor1");
        cont1.add(l1);
        cont1.add(l2);
        cont1.mostrarDetalles();
    }
}