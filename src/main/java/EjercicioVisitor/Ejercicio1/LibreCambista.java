package EjercicioVisitor.Ejercicio1;

public class LibreCambista implements IVisitante {

    //definimos metodos para cambiar el dinero para cada pais+
    @Override
    public void cambiarDineroBolivia(Bolivia bolivia) {
        if(bolivia.getMoneda().equals("boliviano")){
            String cambio = String.format("%.2f", bolivia.getMonto() / 6.96);
            System.out.println("LIBRECAMBISTA MODO BOLIVIANO");
            System.out.println("El cambio de " + bolivia.getMonto() + " Bs a $ es: " + cambio + " $");
        } else if(bolivia.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", bolivia.getMonto() * 6.96);
            System.out.println("El cambio de " + bolivia.getMonto() + " $ a Bs es: " + cambio + " Bs");
        } else {
            System.out.println("Esa moneda no hay hermano");
        }
    }

    @Override
    public void cambiarDineroArgentina(Argentina argentina) {
        if(argentina.getMoneda().equals("peso")){
            String cambio = String.format("%.2f", argentina.getMonto() * 0.0081);
            System.out.println("LIBRECAMBISTA MODO GAUCHO, PASAAA EL ASADO PIBE, UNOS MATES?");
            System.out.println("El cambio de " + argentina.getMonto() + " ARS a $ es: " + cambio + " $");
        } else if(argentina.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", argentina.getMonto() / 0.0081);
            System.out.println("El cambio de " + argentina.getMonto() + " $us a Pesos Argentinos es: " + cambio + " ARS");
        } else {
            System.out.println("Esa moneda no hay hermano");
        }
    }

    @Override
    public void cambiarDineroBrasil(Brasil brasil) {
        if(brasil.getMoneda().equals("real")){
            String cambio = String.format("%.2f", brasil.getMonto() * 0.19);
            System.out.println("LIBRECAMBISTA MODO BRAZUCO, * baila *");
            System.out.println("El cambio de " + brasil.getMonto() + " R$ a $ es: " + cambio + " $");
        } else if(brasil.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", brasil.getMonto() / 0.19);
            System.out.println("El cambio de " + brasil.getMonto() + " $ a Reales es: " + cambio + " R$");
        } else {
            System.out.println("Esa moneda no hay hermano");
        }
    }

    @Override
    public void cambiarDineroItalia(Italia italia) {
        if(italia.getMoneda().equals("euro")){

            String cambio = String.format("%.2f", italia.getMonto() * 1.05);
            System.out.println("LIBRECAMBISTA MODO ITALIANO, MAMA MIA");
            System.out.println("El cambio de " + italia.getMonto() + " € a $ es: " + cambio + " $");
        } else if(italia.getMoneda().equals("dolar")) {
            String cambio = String.format("%.2f", italia.getMonto() / 1.05);
            System.out.println("El cambio de " + italia.getMonto() + " $ a Euros es: " + cambio + " euros");
        } else {
            System.out.println("Esa moneda no hay hermano");
        }
    }
}
