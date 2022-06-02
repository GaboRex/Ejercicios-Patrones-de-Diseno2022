package EjercicioMediator.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Skype implements IMediator{
    //creamos mapa
    Map<Personita, String> m = new HashMap<Personita,String>();

    public void addChat(Personita personita){
        m.put(personita,personita.getCargo());
    }
    @Override
    public void send(String msg, Personita personita) {
        Personita emi = (Personita) personita;

        for (Personita pe : m.keySet()){
            if(!emi.getCi().equals(pe.getCi())){
                if(emi.getCargo().equals("QA") && pe.getCargo().equals("QA")){
                    pe.receive(msg);
                } else if (emi.getCargo().equals("DEV") && pe.getCargo().equals("DEV")){
                    pe.receive(msg);
                } else if (emi.getCargo().equals("SM")) {
                    pe.receive(msg);
                }
            }
        }
    }
}
