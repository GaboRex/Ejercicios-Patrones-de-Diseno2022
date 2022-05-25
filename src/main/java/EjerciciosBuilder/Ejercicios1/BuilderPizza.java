package EjerciciosBuilder.Ejercicios1;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getProduct(){
        return pizza;
    }

    public void prepararPizza(){
        this.pizza = new Pizza();
    }
    public abstract void buildIngredientes();
    public abstract void buildTipoDeMasa();
    public abstract void buildTipoDeQueso();
}
