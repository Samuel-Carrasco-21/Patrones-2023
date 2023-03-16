package bridge.practice.WithBridge;

public class Main {
    public static void main(String[] args) {
        IArquitectura arquitecturaX86 = 
        new ArquitecturaX86("x86", "intel");

        IArquitectura arquitecturaX64 = 
        new ArquitecturaX64("x64", "AMD", "ASUS");

        Windows windows = 
        new Windows(
            "Windows x86",
           10.0,
           "Microsoft",
           arquitecturaX86);

        Linux linux =
        new Linux(
            "Linux x64",
            22.4,
            "Ubuntu",
            arquitecturaX64);

        windows.showPlataforma();
        linux.showPlataforma();
    }
}
