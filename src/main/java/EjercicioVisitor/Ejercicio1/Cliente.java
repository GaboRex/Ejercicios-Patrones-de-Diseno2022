package EjercicioVisitor.Ejercicio1;

public class Cliente {
    public static void main(String[] args){
        LibreCambista l1 = new LibreCambista();

        Italia italia = new Italia();
        italia.setCambio(300, "boliviano");
        italia.aceptar(l1);
        italia.setCambio(100, "dolar");
        italia.aceptar(l1);



/*
//descomentar para usar cada caso

 Bolivia bolivia = new Bolivia();
        bolivia.setCambio(500, "dolar");
        bolivia.aceptar(l1);
        bolivia.setCambio(400, "boliviano");
        bolivia.aceptar(l1);
        bolivia.setCambio(200, "bolivianos");
        bolivia.aceptar(l1);
        //----------------------------------------------
 Argentina argentina = new Argentina();
        argentina.setCambio(40, "dolar");
        argentina.aceptar(l1);
        //------------------------------------------
        Brasil brasil = new Brasil();
        brasil.setCambio(50, "dolar");
        brasil.aceptar(l1);

 */
    }
}
