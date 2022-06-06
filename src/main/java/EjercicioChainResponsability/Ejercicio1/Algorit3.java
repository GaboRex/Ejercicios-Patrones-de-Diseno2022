package EjercicioChainResponsability.Ejercicio1;

public class Algorit3 implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length > 50){
            insertS(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }

    //ALGORITMO ORDENAMIENTO
    private void insertS(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > key.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = key;
        }
        System.out.println("\n--------Lista ordenada por el ALGORITMO3: --------\n");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("\n -Nombre: " + personas[i].getNombre() + "\n - CI: " + personas[i].getCi() + "\n - Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
