package EjercicioMediator.Ejercicio1;

import java.text.DecimalFormat;
import java.util.Queue;

public class Cliente {
    public static void main(String[] args) {
        Skype skyEmp = new Skype();

        //------------------------------------ creando sm--------------------------------------------
        Sm sm1 = new Sm(skyEmp);
        sm1.setCargo("SM");
        sm1.setNombre("Pablo Badani");
        sm1.setCi("12435345443");
        sm1.setCertificaciones("Scrum Master");

        Sm sm2 = new Sm(skyEmp);
        sm2.setCargo("SM");
        sm2.setNombre("Miguel Molina ");
        sm2.setCi("132312325");
        sm2.setCertificaciones("Junior Scrum Master");

        Sm sm3 = new Sm(skyEmp);
        sm3.setCargo("SM");
        sm3.setNombre("Richard Rojas");
        sm3.setCi("7833332226");
        sm3.setCertificaciones("Principal Scrum Master");

        skyEmp.addChat(sm1);
        skyEmp.addChat(sm2);
        skyEmp.addChat(sm3);

        //------------------------------------ creando dev--------------------------------------------
        Dev dev1 = new Dev(skyEmp);
        dev1.setCargo("DEV");
        dev1.setNombre("Camila Cabello");
        dev1.setCi("4534423436");
        dev1.setLenguaje("C++");

        Dev dev2 = new Dev(skyEmp);
        dev2.setCargo("DEV");
        dev2.setNombre("Antonella Perez");
        dev2.setCi("46834534343");
        dev2.setLenguaje("Scala");

        Dev dev3 = new Dev(skyEmp);
        dev3.setCargo("DEV");
        dev3.setNombre("Gabriel Neme");
        dev3.setCi("491212125");
        dev3.setLenguaje("Kotlin");

        skyEmp.addChat(dev1);
        skyEmp.addChat(dev2);
        skyEmp.addChat(dev3);

        //------------------------------------ creando QA--------------------------------------------

        Qa qa1 = new Qa(skyEmp);
        qa1.setCargo("QA");
        qa1.setNombre("Gabriel Ballon");
        qa1.setCi("7893434323");
        qa1.setGrado("Principal QA");

        Qa qa2 = new Qa(skyEmp);
        qa2.setCargo("QA");
        qa2.setNombre("Karim Benzema");
        qa2.setCi("2293424230");
        qa2.setGrado("Junior QA");

        Qa qa3 = new Qa(skyEmp);
        qa3.setCargo("QA");
        qa3.setNombre("Kylian Mbappe");
        qa3.setCi("2343444455");
        qa3.setGrado("Junior QA");

        skyEmp.addChat(qa1);
        skyEmp.addChat(qa2);
        skyEmp.addChat(qa3);

        sm1.send("Esto es para todos");
        dev2.send("Esta es para los de DEV");
        qa1.send("Esto es para los de QA");

    }
}
