package Ejercicio_Fila_B.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        PelotaFutbol pelotaFutbol = new PelotaFutbolCreator().factoryMethod();
        Camiseta camiseta = (Camiseta) new CamisetaCreator().factoryMethod();
        Shorts shorts = (Shorts) new ShortsCreator().factoryMethod();
        Medias medias = (Medias) new MediasCreator().factoryMethod();
        Tenis tenis = (Tenis) new TenisCreator().factoryMethod();

        pelotaFutbol.showInfo();
        camiseta.showInfo();
        shorts.showInfo();
        medias.showInfo();
        tenis.showInfo();

    }
}
