package EjercicioBridge.Ejercicio1;

public class EmpresaSRL implements IEmpresa {
    private IEnvio envio;

    public EmpresaSRL() {
    }

    public IEnvio getEnvio() {
        return envio;
    }

    public void setEnvio(IEnvio envio) {
        this.envio = envio;
    }

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("La empresa SRL recibio un paquete!");
        envio.enviar(paquete);
    }
}
