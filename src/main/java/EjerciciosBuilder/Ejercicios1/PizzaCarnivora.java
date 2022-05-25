package EjerciciosBuilder.Ejercicios1;

public class PizzaCarnivora extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Pepperoni, salchicha, carne de res, tocino ahumado, jamon , queso mozzarella y nuestra deliciosa salsa de tomate.");
    }

    @Override
    public void buildTipoDeMasa() {
        this.pizza.setTipoDeMasa("Masa con borde de queso.");
    }

    @Override
    public void buildTipoDeQueso() {
        this.pizza.setTipoDeQueso("Queso mozarella y extra cheddar.");
    }
}
