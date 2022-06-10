package EjercicioStrategy.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        // creamos tienda de ropa
        TiendaRopa tiendaRopa = new TiendaRopa("Ropita 3 B ----> BUENO,BONITO Y BARATO");
        tiendaRopa.addRopa(new Ropa("Chaqueta", "Jean caki", 40));
        tiendaRopa.addRopa(new Ropa("Sudadera nike", "Verde Botella", 80));
        tiendaRopa.addRopa(new Ropa("Baggy jean", "Celeste", 45));
        tiendaRopa.addRopa(new Ropa("Medias PacMan", "PacMans", 20));
        tiendaRopa.addRopa(new Ropa("Hoodie Rugrats", "Ploma", 90));

        //tiendaRopa.setEstacion(new Invierno());
        tiendaRopa.setEstacion(new Otonio());
        //tiendaRopa.setEstacion(new Primavera());
        //tiendaRopa.setEstacion(new Verano());

        /*
        Para poder usar o hacer correr las diferentes estaciones deberiamos descomentar la estacion que queramos una a la vez
         */
        tiendaRopa.iniciarEstacion();


    }
}
