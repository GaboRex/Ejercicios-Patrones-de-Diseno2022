package EjercicioObserver.Ejercicio1;



public class Notificaciones {
    private String preciosLlamada;
    private String promociones;
    private String premios;
    private String noticia;
    private String catalizador;

    public Notificaciones(String preciosLlamada, String promociones, String premios, String noticia, String catalizador) {
        this.preciosLlamada = preciosLlamada;
        this.promociones = promociones;
        this.premios = premios;
        this.noticia = noticia;
        this.catalizador = catalizador;
    }

    public String getCatalizador() {
        return catalizador;
    }

    public void setCatalizador(String catalizador) {
        this.catalizador = catalizador;
    }

    public String getPreciosLlamada() {
        return preciosLlamada;
    }

    public void setPreciosLlamada(String preciosLlamada) {
        this.preciosLlamada = preciosLlamada;
    }

    public String getPremios() {
        return premios;
    }

    public String getPromociones() {
        return promociones;
    }

    public void setPromociones(String promociones) {
        this.promociones = promociones;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }
    public void showInfo(){
        System.out.println("**** notificacion ***");
        System.out.println("precios de llamada: "+preciosLlamada);
        System.out.println("promociones: "+promociones);
        System.out.println("premios: "+premios);
        System.out.println("noticia: "+noticia);
        System.out.println();
    }
    public void showInfo2(){
        System.out.println("**** notificacion ***");
        System.out.println("promociones: "+promociones);
        System.out.println("premios: "+premios);
        System.out.println();
    }
    public void showInfo3(){
        System.out.println("**** notificacion ***");
        System.out.println("noticia: "+noticia);
        System.out.println();
    }
}
