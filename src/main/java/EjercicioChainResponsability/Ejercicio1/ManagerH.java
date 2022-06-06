package EjercicioChainResponsability.Ejercicio1;

import javafx.scene.control.Alert;

import java.util.ArrayList;

public class ManagerH implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        Algorit1 a1 = new Algorit1();
        this.setNext(a1);

        Algorit2 a2 = new Algorit2();
        a1.setNext(a2);

        Algorit3 a3 = new Algorit3();
        a2.setNext(a3);

        this.next.criteriaHandler(personas);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
