package EjerciciosSingleton.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
        Persona pablo = new Persona();
        pablo.setNombre("Pablo");
        pablo.setCi("12609156");
        pablo.setCiudad("Santa Cruz");

        Persona richard = new Persona();
        richard.setNombre("Richard");
        richard.setCi("12600156");
        richard.setCiudad("Sucre");

        Persona miguel = new Persona();
        miguel.setNombre("Miguel");
        miguel.setCi("12500156");
        miguel.setCiudad("Pando");

        //Creamos bancos
        Banco banco = new Banco(pablo,"Banco Sol");
        banco.cambiarDivisaABanco(100,"Dolar","Boliviano");
        banco.cambiarDivisaABanco(50,"Boliviano","Euro");

        //Creamos Casas de cambio
        CasaDeCambio casaDeCambio = new CasaDeCambio(miguel);
        casaDeCambio.cambiarDivisaACasaDeCambio(69,"Euro","Boliviano");
        casaDeCambio.cambiarDivisaACasaDeCambio(24000,"Boliviano","Dolar");

        //Creamos Librecambistas
        LibreCambista libreCambista = new LibreCambista(richard);
        libreCambista.cambiarDivisaLibrecambista(600,"Boliviano","Peso Argentino");
        libreCambista.cambiarDivisaLibrecambista(550,"Boliviano","Peso Euro");
    }
}
