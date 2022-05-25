package EjerciciosBuilder.Ejercicios1;

public class PizzaHawaina extends BuilderPizza {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Jamon, jugosa pina, queso mozzarella y nuestra deliciosa salsa de tomate.");
    }

    @Override
    public void buildTipoDeMasa() {
        this.pizza.setTipoDeMasa("Masa normal sin conservantes.");
    }

    @Override
    public void buildTipoDeQueso() {
        this.pizza.setTipoDeQueso("Queso mozarella (tipo2). ");
    }
}
