package EjercicioState.Ejercicio1;

import java.util.Random;

public class Encendido implements IStateCompu{
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("\n <<< PC EN USO >>> \n");
        double currentValue = computadora.getCpu().getCapacidadUtilizada();
        int programasAbiertos = new Random().nextInt(10);
        computadora.getProgramas().setProgramasUtilizados("\n Estan en uso " + programasAbiertos + " programas \n");
        System.out.println(computadora.getProgramas().getProgramasUtilizados());
        while (currentValue < 100){
            Thread.sleep(5000);
            computadora.getCpu().showInfo();
            currentValue = currentValue + (double) programasAbiertos * 5 / 100;
            computadora.getCpu().setCapacidadUtilizada(currentValue);
        }
        System.out.println("100% de uso de la CPU");
    }
}

