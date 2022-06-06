package EjercicioChainResponsability.Ejercicio1;

public class Algorit1 implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length <= 20){
            OrdenaBurbuja(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }

    //ALGORITMO ORDENAMIENTO
    private void OrdenaBurbuja(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
        System.out.println("\n--------Lista ordenada por el ALGORITMO1: --------\n");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("\n -Nombre: " + personas[i].getNombre() + "\n - CI: " + personas[i].getCi() + "\n - Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
