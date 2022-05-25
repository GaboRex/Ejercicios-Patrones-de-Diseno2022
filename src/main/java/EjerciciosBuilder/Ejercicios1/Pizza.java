package EjerciciosBuilder.Ejercicios1;

public class Pizza {
    private String ingredientes;
    private String tipoDeMasa;
    private String tipoDeQueso;

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoDeMasa() {
        return tipoDeMasa;
    }

    public void setTipoDeMasa(String tipoDeMasa) {
        this.tipoDeMasa = tipoDeMasa;
    }

    public String getTipoDeQueso() {
        return tipoDeQueso;
    }

    public void setTipoDeQueso(String tipoDeQueso) {
        this.tipoDeQueso = tipoDeQueso;
    }

    public void mostrarInfoPizza(){
        System.out.println("\n ****  UN MOMENTO POR FAVOR LINGUINI ESTA PREPARANDO TU PIZZA *** \n");
        System.out.println("Tus Ingredientes: " +ingredientes);
        System.out.println("Tu Tipo de Masa: " +tipoDeMasa);
        System.out.println("Tu Tipo de Queso: " +tipoDeQueso);
        System.out.println();
    }
}
