package EjercicioMemento.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        Backup back = new Backup();

        //------------------------------------------- creando primer lista-------------------------
        List<Personita> l1 = new ArrayList<>();
        l1.add(new Personita("Pablo", "1453243223", 26));
        l1.add(new Personita("Gabriel", "44361232321", 20));
        back.setBackup(l1);
        bd.createBackup("BackupDiciembre", back.createBackup());

        //------------------------------------------- creando segundo lista-------------------------


        List<Personita> l2 = new ArrayList<>();
        l2.add(new Personita("Gisel", "888989898", 19));
        l2.add(new Personita("Miguel", "1312322342", 22));
        back.setBackup(l2);
        bd.createBackup("BackupEnero", back.createBackup());

        //------------------------------------------- creando tercer lista-------------------------

        List<Personita> l3 = new ArrayList<>();
        l3.add(new Personita("Sergio", "11111111", 26));
        l3.add(new Personita("Karim", "222222222", 45));
        back.setBackup(l3);
        bd.createBackup("BackupFebrero", back.createBackup());

//------------------------------------------- creando cuarta lista-------------------------

        List<Personita> l4 = new ArrayList<>();
        l4.add(new Personita("Bruno", "44444444", 20));
        l4.add(new Personita("Cristiano", "555555534", 33));
        back.setBackup(l4);
        bd.createBackup("BackupMarzo", back.createBackup());

        //------------------------------------------- creando quinta lista-------------------------

        List<Personita> l5 = new ArrayList<>();
        l5.add(new Personita("Francisco", "12121112", 30));
        l5.add(new Personita("Patricio", "565656", 50));
        back.setBackup(l5);
        bd.createBackup("BackupAbril", back.createBackup());

        List<Personita> listaFinal = back.restoreBackup(bd.getCommit("BackupEnero"));
        for (Personita p : listaFinal) {
            System.out.println("- " + p.getName());
        }
    }
}
