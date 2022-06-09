package EjercicioState.Ejercicio1;

public class Programas {
    private String programasUtilizados;

    public Programas(){}

    public String getProgramasUtilizados() {
        return programasUtilizados;
    }

    public Programas setProgramasUtilizados(String programasUtilizados) {
        this.programasUtilizados = programasUtilizados;
        return this;
    }

    public void showInfo(){
        System.out.println(programasUtilizados);
    }
}
