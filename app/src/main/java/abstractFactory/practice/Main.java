package abstractFactory.practice;

public class Main {
    public static void main(String[] args) {
        String standart = "standart";
        String solidario = "solidario";
        String infante = "infante";

        PasajeStandart p1 = (PasajeStandart) FactoryPasaje.make(standart);
        PasajeStandart p2 = (PasajeStandart) FactoryPasaje.make(standart);

        PasajeSolidario p3 = (PasajeSolidario) FactoryPasaje.make(solidario);
        PasajeSolidario p4 = (PasajeSolidario) FactoryPasaje.make(solidario);

        PasajeInfantes p5 = (PasajeInfantes) FactoryPasaje.make(infante);
        PasajeInfantes p6 = (PasajeInfantes) FactoryPasaje.make(infante);

        p1.mostrarPasaje();
        System.out.println();
        p2.mostrarPasaje();
        System.out.println();
        p3.mostrarPasaje();
        System.out.println();
        p4.mostrarPasaje();
        System.out.println();
        p5.mostrarPasaje();
        System.out.println();
        p6.mostrarPasaje();

    }
}
