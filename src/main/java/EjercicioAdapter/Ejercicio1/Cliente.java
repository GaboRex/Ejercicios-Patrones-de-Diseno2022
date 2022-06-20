package EjercicioAdapter.Ejercicio1;

public class Cliente {
    public static void main(String[] args) throws InterruptedException {
        IEmpresa1 celu1 = new Celular(3000, 10);
        celu1.mostrarPrecio();
        celu1.mostrarTiempo();
//***************************************************************************************************************************************************************************
        IEmpresa1 tablet1 = new Tablet(4000, 8);
        tablet1.mostrarPrecio();
        tablet1.mostrarTiempo();
//***************************************************************************************************************************************************************************
        IEmpresa1 pc1 = new Compu(10000, 6);
        pc1.mostrarPrecio();
        pc1.mostrarTiempo();
//***************************************************************************************************************************************************************************
        IEmpresa1 tv1 = new Artefact(new Tv(4000, 2));
        tv1.mostrarPrecio();
        tv1.mostrarTiempo();
//***************************************************************************************************************************************************************************
        IEmpresa1 lavadora1 = new Artefact(new Lavadora(6600, 2));
        lavadora1.mostrarPrecio();
        lavadora1.mostrarTiempo();
//***************************************************************************************************************************************************************************
        IEmpresa1 refri1 = new Artefact(new Refri(11000, 3));
        refri1.mostrarPrecio();
        refri1.mostrarTiempo();
    }
}
