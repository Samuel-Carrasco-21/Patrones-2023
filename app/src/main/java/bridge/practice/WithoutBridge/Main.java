package bridge.practice.WithoutBridge;

public class Main {
    public static void main(String[] args) {
        Windows7x87 windows7x87 = new 
        Windows7x87(
            "Windows 7x87",
            10,
            "7x87",
            "Microsoft",
            "192.184.194.94");

        Windows7x64 windows7x64 = new 
        Windows7x64(
            "Windows 7x64",
            11,
            "7x64",
            "Microsoft",
            "FF.09.AF.BC.04.BC");

        Linuxx86 linuxx86 = new 
        Linuxx86(
            "Linux x86",
            22.4,
            "x86",
            "GNU/Linux",
            "Ubuntu");

        Linuxx64 linuxx64 = new 
        Linuxx64(
            "Linux x64",
            11.4,
            "x64",
            "GNU/Linux",
            "Debian");

        windows7x87.showInfo();
        windows7x64.showInfo();
        linuxx86.showInfo();
        linuxx64.showInfo();
    }
}
