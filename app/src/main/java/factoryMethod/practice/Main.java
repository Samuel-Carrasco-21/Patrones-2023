package factoryMethod.practice;

public class Main {
    public static void main(String[] args) {
        PasajeStandart p1 = new PasajeStandartCreator().create();
        PasajeStandart p2 = new PasajeStandartCreator().create();

        PasajeSolidario p3 = new PasajeSolidarioCreator().create();
        PasajeSolidario p4 = new PasajeSolidarioCreator().create();
        
        PasajeInfantes p5 = new PasajeInfantesCreator().create();
        PasajeInfantes p6 = new PasajeInfantesCreator().create();

        p1.mostrarPasaje();
        p2.mostrarPasaje();
        p3.mostrarPasaje();
        p4.mostrarPasaje();
        p5.mostrarPasaje();
        p6.mostrarPasaje();
    }
}
