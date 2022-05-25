package EjerciciosBuilder.Ejercicios1;

public class Cliente {
    public static void main(String[] args) {
        Owner pablito = new Owner();
        BuilderPizza pizzaHawaina = new PizzaHawaina();
        BuilderPizza pizzaCarnivora = new PizzaCarnivora();
        BuilderPizza pizzaClasica = new PizzaClasica();

        pablito.setBuilder(pizzaCarnivora);
        pablito.buildPizza();
        Pizza pz1   = pablito.getPizzaHecha();
        pz1.mostrarInfoPizza();

        pablito.setBuilder(pizzaClasica);
        pablito.buildPizza();
        Pizza pz2   = pablito.getPizzaHecha();
        pz2.mostrarInfoPizza();

        pablito.setBuilder(pizzaHawaina);
        pablito.buildPizza();
        Pizza pz3   = pablito.getPizzaHecha();
        pz3.mostrarInfoPizza();
    }
}
