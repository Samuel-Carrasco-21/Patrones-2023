package abstractFactory.practice;

import java.util.Scanner;

public class FactoryPasaje {
    public static IPasaje make(String tipo){
        tipo = tipo.toLowerCase();
        switch(tipo){
            case "standart":
                return standart();
            case "solidario":
                return solidario();
            case "infante":
                return infante();
        }
        return null;
    }

    public static PasajeInfantes infante(){
        PasajeInfantes pasajeInfantes = new PasajeInfantes();

        pasajeInfantes.setVuelo(13);

        Destino destino = new Destino();
        destino.setPais("Mexico");
        destino.setCiudad("Ciudad de Mexico");
        destino.setAeropuerto("Aeropuerto Internacional de la Ciudad de Mexico");
        pasajeInfantes.setDestino(destino);

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Internacional El Alto");
        pasajeInfantes.setOrigen(origen);

        Avion avion = new Avion();
        avion.setMarca("BOA");
        avion.setCapacidad(100);
        avion.setModelo("Boeing 767");
        avion.setNumeroDeAsientos(100);
        pasajeInfantes.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre(pedirDato("Nombre de Pasajero"));
        pasajero.setCi(Integer.parseInt(pedirDato("CI de Pasajero")));
        pasajeInfantes.setPasajero(pasajero);
        
        if(AsientoTomado.getInstance().getPasajerosAbordo()<100){
            AsientoTomado.getInstance()
            .setPasajerosAbordo(
                AsientoTomado.getInstance().getPasajerosAbordo()+1);

                pasajeInfantes.setNumeroAsiento(
                AsientoTomado.getInstance().getPasajerosAbordo());
        }else{
            System.out.println("No hay asientos disponibles");
            return null;
        }

        pasajeInfantes.setCostoEspecial(7);

        return pasajeInfantes;
    }

    public static PasajeSolidario solidario(){
        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setVuelo(13);

        Destino destino = new Destino();
        destino.setPais("Mexico");
        destino.setCiudad("Ciudad de Mexico");
        destino.setAeropuerto("Aeropuerto Internacional de la Ciudad de Mexico");
        pasajeSolidario.setDestino(destino);

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Internacional El Alto");
        pasajeSolidario.setOrigen(origen);

        Avion avion = new Avion();
        avion.setMarca("BOA");
        avion.setCapacidad(100);
        avion.setModelo("Boeing 767");
        avion.setNumeroDeAsientos(100);
        pasajeSolidario.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre(pedirDato("Nombre de Pasajero"));
        pasajero.setCi(Integer.parseInt(pedirDato("CI de Pasajero")));
        pasajeSolidario.setPasajero(pasajero);

        if(AsientoTomado.getInstance().getPasajerosAbordo()<100){
            AsientoTomado.getInstance()
            .setPasajerosAbordo(
                AsientoTomado.getInstance().getPasajerosAbordo()+1);

            pasajeSolidario.setNumeroAsiento(
                AsientoTomado.getInstance().getPasajerosAbordo());
        }else{
            System.out.println("No hay asientos disponibles");
            return null;
        }

        pasajeSolidario.setCostoPasaje(10);

        pasajeSolidario.setDescuento(40);

        pasajeSolidario
        .setMotivoDescuento(
            "Persona de 3ra edad o incapacitada");

        return pasajeSolidario;
    }

    public static PasajeStandart standart(){
        PasajeStandart pasajeStandart = new PasajeStandart();
        pasajeStandart.setVuelo(13);

        Destino destino = new Destino();
        destino.setPais("Mexico");
        destino.setCiudad("Ciudad de Mexico");
        destino.setAeropuerto("Aeropuerto Internacional de la Ciudad de Mexico");
        pasajeStandart.setDestino(destino);

        Origen origen = new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Internacional El Alto");
        pasajeStandart.setOrigen(origen);

        Avion avion = new Avion();
        avion.setMarca("BOA");
        avion.setCapacidad(100);
        avion.setModelo("Boeing 767");
        avion.setNumeroDeAsientos(100);
        pasajeStandart.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre(pedirDato("Nombre de Pasajero"));
        pasajero.setCi(Integer.parseInt(pedirDato("CI de Pasajero")));
        pasajeStandart.setPasajero(pasajero);
        
        if(AsientoTomado.getInstance().getPasajerosAbordo()<100){
            AsientoTomado.getInstance()
            .setPasajerosAbordo(
                AsientoTomado.getInstance().getPasajerosAbordo()+1);

            pasajeStandart.setNumeroAsiento(
                AsientoTomado.getInstance().getPasajerosAbordo());
        }else{
            System.out.println("No hay asientos disponibles");
            return null;
        }

        pasajeStandart.setCostoPasaje(10);

        return pasajeStandart;
    }

    public static String pedirDato(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato para "+mensaje+": ");
        String respuesta = scanner.nextLine();
        return respuesta;
    }

}
