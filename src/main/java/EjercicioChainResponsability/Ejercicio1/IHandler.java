package EjercicioChainResponsability.Ejercicio1;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(Persona[]  personas);
    IHandler next();

}
