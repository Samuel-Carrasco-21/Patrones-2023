package bridge.practice.WithBridge;

public class ArquitecturaX86 implements IArquitectura{

    private String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String procesador;
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public ArquitecturaX86(String tipo, String procesador) {
        this.tipo = tipo;
        this.procesador = procesador;
    }

    @Override
    public void showArquitectura() {
        System.out.println("--- Arquitectura ---");
        System.out.println("* Tipo: "+tipo);
        System.out.println("* Procesador: "+procesador);
    }
    
}
