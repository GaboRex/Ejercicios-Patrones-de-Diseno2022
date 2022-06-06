package EjercicioChainResponsability.Ejercicio1;

public class Cliente {
    public static void main(String[] args) {
//creamos personas

        Persona p1 = new Persona("1213132", "Pablo", 20);
        Persona p2 = new Persona("2312321", "Gabriel", 20);
        Persona p3 = new Persona("345334243", "Gisel", 19);
        Persona p4 = new Persona("4456454", "Paola", 30);
        Persona p5 = new Persona("52423432432", "Miguel", 23);
        Persona p6 = new Persona("624434234", "Richard", 11);
        Persona p7 = new Persona("73242424", "Fabricio", 33);
        Persona p8 = new Persona("8242433432", "Maria", 34);
        Persona p9 = new Persona("9342433424", "Laura", 11);
        Persona p10 = new Persona("1024343", "Alejandra", 44);

        Persona p11 = new Persona("1123212312", "Cristina", 12);
        Persona p12 = new Persona("123213122", "Georgina", 44);
        Persona p13 = new Persona("1323132", "Marcos", 55);
        Persona p14 = new Persona("1123123124", "Roberto", 56);
        Persona p15 = new Persona("15213132321", "Humberto", 66);
        Persona p16 = new Persona("3213231232", "Martha", 80);
        Persona p17 = new Persona("172313213", "Ezequiel", 34);
        Persona p18 = new Persona("14353438", "Lionel", 35);
        Persona p19 = new Persona("1433435659", "William", 33);
        Persona p20 = new Persona("5675656520", "Penelope", 31);

        Persona p21 = new Persona("223132134324", "Ronald", 63);
        Persona p22 = new Persona("22321321312", "Vinicius", 8);
        Persona p23 = new Persona("22313213123", "Karim", 51);
        Persona p24 = new Persona("23434334343", "Daniel", 59);
        Persona p25 = new Persona("23434353432", "Andres", 30);
        Persona p26 = new Persona("2634343434", "Giovanna", 4);
        Persona p27 = new Persona("2132212317", "Giovanni", 30);
        Persona p28 = new Persona("282323213", "Joseph", 50);
        Persona p29 = new Persona("292312321", "Noelia", 60);
        Persona p30 = new Persona("3054545445", "Camila", 3);

        Persona p31 = new Persona("314343342", "Natalia", 65);
        Persona p32 = new Persona("36766767725", "Dianara", 33);
        Persona p33 = new Persona("36767766763", "Cecilia", 41);
        Persona p34 = new Persona("356456544", "Alicia", 81);
        Persona p35 = new Persona("356456455", "Nicolas", 18);
        Persona p36 = new Persona("365654654", "Giorgio", 77);
        Persona p37 = new Persona("35345347", "Natalia", 72);
        Persona p38 = new Persona("354548", "Samuel", 19);
        Persona p39 = new Persona("356565569", "Sergino", 37);
        Persona p40 = new Persona("456534650", "Mauro", 69);

        Persona p41 = new Persona("43232121", "Andrea", 23);
        Persona p42 = new Persona("4223213123", "Jose", 46);
        Persona p43 = new Persona("4231231233", "Richardo", 21);
        Persona p44 = new Persona("423213124", "Fatima", 14);
        Persona p45 = new Persona("4213213215", "Gabriela", 47);
        Persona p46 = new Persona("423123216", "Micaela", 15);
        Persona p47 = new Persona("423213217", "Manuela", 38);
        Persona p48 = new Persona("48123213213", "Antonio", 40);
        Persona p49 = new Persona("423123129", "Carla", 63);
        Persona p50 = new Persona("5213123210", "Carmen", 86);
        Persona p51 = new Persona("5213123121", "Abdiel", 9);
        Persona p52 = new Persona("5213123213123", "Sthepen", 9);

        //array
        Persona[] personas = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10
                , p11, p12, p13, p14, p15, p16, p17, p18, p19, p20
                , p21, p22, p23, p24, p25, p26, p27, p28, p29, p30
                , p31, p32, p33, p34, p35, p36, p37, p38, p39, p40
                , p41, p42, p43, p44, p45, p46, p47, p48, p49, p50
                , p51 , p52};

        /*
        1. Si quieremos usar el algortimo 1 comentar o cortar para que haya maximo 20 personas en el array.
        2. Para el algoritmo 2 solo ponemos en el array Persona maximo 50, borrando p51, y p52 del array.
        3. Para el algoritmo 3 lo hacemos correr como esta.
         */


        ManagerH managerH = new ManagerH();
        managerH.criteriaHandler(personas);

    }
}
