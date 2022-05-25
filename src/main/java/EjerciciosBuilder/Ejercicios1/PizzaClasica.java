package EjerciciosBuilder.Ejercicios1;

public class PizzaClasica extends BuilderPizza {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Jamon,queso mozarella y nuestra deliciosa salsa de tomate.");
    }

    @Override
    public void buildTipoDeMasa() {
        this.pizza.setTipoDeMasa("Masa especial con borde relleno queso cheddar");

    }

    @Override
    public void buildTipoDeQueso() {
        this.pizza.setTipoDeQueso("Queso mozarella y dambo");

    }
}
