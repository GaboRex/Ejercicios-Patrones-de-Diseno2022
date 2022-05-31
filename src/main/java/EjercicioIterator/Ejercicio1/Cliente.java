package EjercicioIterator.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {
     ConcreteImportadora1 impor1 = new ConcreteImportadora1();

     impor1.add(new Auto(16000  , "Susuki Swift" , 5, "Auto pequeño"));


     ConcreteImportadora2 impor2 = new ConcreteImportadora2();

        impor2.add(new Auto(20000  , "Nissan Skyline" , 5, "Auto de carreras"));

        ConcreteImportadora3 impor3 = new ConcreteImportadora3();

        impor3.add(new Auto(100000  , "Lamborghini Sesto Elemento" , 5, "Auto de lujo"));

        ConcreteImportadora4 impor4 = new ConcreteImportadora4();

        impor4.add(new Auto(23000  , "Toyota Prado" , 7, "Vagoneta"));

        Iterator iterator;
        Map< Auto, String> map = new HashMap<Auto, String>();


        iterator = impor1.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put( auto , auto.getModelo());
        }

        iterator = impor2.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put( auto , auto.getModelo());
        }

        iterator = impor3.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put( auto , auto.getModelo());
        }

        iterator = impor4.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put( auto , auto.getModelo());
        }
        System.out.println("INVENTARIO DE AUTOS: ");
        for (Auto key : map.keySet()) {
            System.out.println("Auto: "+key.getCosto()+" "+key.getModelo()+" "+key.getNumeroAsientos()+" "+key.getTipo());
        }
    }
}
