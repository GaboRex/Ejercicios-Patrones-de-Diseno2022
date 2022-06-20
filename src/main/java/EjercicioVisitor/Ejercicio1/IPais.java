package EjercicioVisitor.Ejercicio1;

public interface IPais {
    void aceptar(IVisitante visitante);
    void setCambio(int monto, String moneda);
}
