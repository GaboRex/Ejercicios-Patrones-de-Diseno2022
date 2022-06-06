package EjercicioChainResponsability.Ejercicio1;
import java.util.Arrays;
public class Algorit2 implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length > 20 && personas.length <= 50){
            selectionS(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }
//ALGORITMO ORDENAMIENTO
    private void selectionS(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < personas.length; j++)
                if (personas[j].getEdad() < personas[min_idx].getEdad()){
                    min_idx = j;
                }
            Persona temp = personas[min_idx];
            personas[min_idx] = personas[i];
            personas[i] = temp;
        }
        System.out.println("\n--------Lista ordenada por el ALGORITMO2: --------\n");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("\n -Nombre: " + personas[i].getNombre() + "\n - CI: " + personas[i].getCi() + "\n - Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
