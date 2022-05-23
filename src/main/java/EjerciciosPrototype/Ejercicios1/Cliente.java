package EjerciciosPrototype.Ejercicios1;

public class Cliente {
    public static void main(String[] args) {

        Accesorios accesoriosPablito= new Accesorios();
        accesoriosPablito.setTieneEstuche(Boolean.TRUE);
        accesoriosPablito.setTieneCargador(Boolean.FALSE);
        accesoriosPablito.setTieneAudifono(Boolean.TRUE);

        Celular template= new Celular();
        template.setAccesorios(accesoriosPablito);
        template.setTamano("10 centimetros");
        template.setCpu("Exynos 7 Quad 7570");
        template.setMemory("256 gb");
        template.setVersionAndroid(12);
        template.setCamara("Camara trasera de 108 MP y delantera de 50 MP");
        template.setBluetooh("Bluetooth 5.0");
        template.setCantidadDeMemoriasExternas(1);
        template.setTipoDeBateria("Litio");

        Celular celular1 = (Celular) template.clone();
        celular1.setNumeroTel(69696969);
        celular1.setNombreTelefo("VIVA");

        Celular celular2 = (Celular) template.clone();
        celular2.setNumeroTel(6666666);
        celular2.setNombreTelefo("ENTEL");

        Celular celular3 = (Celular) template.clone();
        celular3.setNumeroTel(60529411);
        celular3.setNombreTelefo("TIGO");

        celular1.mostrarInfoCelus();
        celular2.mostrarInfoCelus();
        celular3.mostrarInfoCelus();
    }
}
