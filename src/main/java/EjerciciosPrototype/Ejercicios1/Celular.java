package EjerciciosPrototype.Ejercicios1;

public class Celular {
    private String nombreTelefo;
    private int numeroTel;

    public String getNombreTelefo() {
        return nombreTelefo;
    }

    public void setNombreTelefo(String nombreTelefo) {
        this.nombreTelefo = nombreTelefo;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    private String tamano;
    private String cpu;
    private String memory;
    private int versionAndroid;
    private String camara;
    private String bluetooh;
    private int cantidadDeMemoriasExternas;
    private String tipoDeBateria;



    private Accesorios accesorios = new Accesorios();

    public Celular(){
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(int versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetooh() {
        return bluetooh;
    }

    public void setBluetooh(String bluetooh) {
        this.bluetooh = bluetooh;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone(){

        Accesorios cloneA = new Accesorios();
        cloneA.setTieneCargador(this.getAccesorios().getTieneCargador());
        cloneA.setTieneAudifono(this.getAccesorios().getTieneAudifono());
        cloneA.setTieneEstuche(this.getAccesorios().getTieneEstuche());

        Celular cloneC = new Celular();
        cloneC.setNombreTelefo(this.getNombreTelefo());
        cloneC.setNumeroTel(this.getNumeroTel());
        cloneC.setTamano(this.getTamano());
        cloneC.setCpu(this.getCpu());
        cloneC.setMemory(this.getMemory());
        cloneC.setVersionAndroid(this.getVersionAndroid());
        cloneC.setCamara(this.getCamara());
        cloneC.setBluetooh(this.getBluetooh());
        cloneC.setCantidadDeMemoriasExternas(this.getCantidadDeMemoriasExternas());
        cloneC.setTipoDeBateria(this.getTipoDeBateria());
        cloneC.setAccesorios(cloneA);
        return cloneC;
    }

    public void mostrarInfoCelus(){
        System.out.println(" \n ****  CARACTERISTICAS SAMSUNG R10 *** \n");
        System.out.println("numero de telefono: " +numeroTel);
        System.out.println("nombre de telefonia: " +nombreTelefo);
        System.out.println("tamano: " +tamano);
        System.out.println("cpu: " +cpu);
        System.out.println("memoria: " +memory);
        System.out.println("version de Android: " +versionAndroid);
        System.out.println("camara: " +camara);
        System.out.println("version Bluetooh: " +bluetooh);
        System.out.println("cantidad de memorias externas: " +cantidadDeMemoriasExternas);
        System.out.println("tipo de bateria: " +tipoDeBateria);
        System.out.println("audifono: " +accesorios.getTieneAudifono());
        System.out.println("cargador: " +accesorios.getTieneCargador());
        System.out.println("estuche: " +accesorios.getTieneEstuche());
    }
}


