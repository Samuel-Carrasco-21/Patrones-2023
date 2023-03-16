package bridge.practice.WithBridge;

public class ArquitecturaX64 implements IArquitectura{

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

    private String marca;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArquitecturaX64(String tipo, String procesador, String marca) {
        this.tipo = tipo;
        this.procesador = procesador;
        this.marca = marca;
    }

    @Override
    public void showArquitectura() {
        System.out.println("--- Arquitectura ---");
        System.out.println("* Tipo: "+tipo);
        System.out.println("* Procesador: "+procesador);
        System.out.println("* Marca: "+marca);
    }
    
}
