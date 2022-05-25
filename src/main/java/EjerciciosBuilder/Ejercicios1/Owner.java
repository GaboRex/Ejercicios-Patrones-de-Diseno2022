package EjerciciosBuilder.Ejercicios1;

//owner
public class Owner {
    private BuilderPizza builder;

    public Pizza getPizzaHecha(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderPizza builder){
        this.builder = builder;
    }

    public void buildPizza(){
        this.builder.prepararPizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoDeMasa();
        this.builder.buildTipoDeQueso();


    }
}
