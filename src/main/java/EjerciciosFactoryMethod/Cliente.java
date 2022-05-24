package EjerciciosFactoryMethod;

public class Cliente {
    public static void main(String[] args) {
        //Standard
        Pasajero pablito = new Pasajero();
        pablito.setNombre("Pablo Badani Messi");
        pablito.setCi(5678975);
        pablito.setFechaNacimeinto("31 de febrero de 2001");
        pablito.setCiudad("Chapare");

        Pasajero miguel = new Pasajero();
        miguel.setNombre("Miguel Molina Ronaldo");
        miguel.setCi(6666666);
        miguel.setFechaNacimeinto("30 de octubre de 2001");
        miguel.setCiudad("Chapare");

        PasajeStandard pasaje1 = new CreadorPasajeStandard().creandoProducto(pablito, 69);
        pasaje1.mostrarInfo();

        PasajeStandard pasaje2 = new CreadorPasajeStandard().creandoProducto(miguel, 70);
        pasaje2.mostrarInfo();

        /////////////////////////////////////////////////////////////////////////////////////////////
        //Solidario

        Pasajero richard = new Pasajero();
        richard.setNombre("Richard Rojas Buffon");
        richard.setCi(198989);
        richard.setFechaNacimeinto("9 de noviembre de 1959");
        richard.setCiudad("Lisboa");

        Pasajero georgina = new Pasajero();
        georgina.setNombre("Georgina de Ronaldo");
        georgina.setCi(17777);
        georgina.setFechaNacimeinto("10 de noviembre de 1960");
        georgina.setCiudad("Madrid");

        PasajeSolidario pasaje3 = new CreadorPasajeSolidario().creandoProducto(richard, 1);
        pasaje3.mostrarInfo();

        PasajeSolidario pasaje4 = new CreadorPasajeSolidario().creandoProducto(georgina, 2);
        pasaje4.mostrarInfo();

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        //Infantil
        Pasajero joseph = new Pasajero();
        joseph.setNombre("Joseph Meneses Frijolito");
        joseph.setCi(13567543);
        joseph.setFechaNacimeinto("2 de febrero de 2020");
        joseph.setCiudad("Monterrey");

        Pasajero gisel = new Pasajero();
        gisel.setNombre("Gisel Flores");
        gisel.setCi(15151515);
        gisel.setFechaNacimeinto("12 de febrero de 2020");
        gisel.setCiudad("La Paz");

        PasajeInfantes pasaje5 = new CreadorPasajeInfante().creandoProducto(joseph, 20);
        pasaje5.mostrarInfo();

        PasajeInfantes pasaje6 = new CreadorPasajeInfante().creandoProducto(gisel, 23);
        pasaje6.mostrarInfo();
    }
}
