package factoryMethod.practice;

import java.util.Scanner;

public class PasajeInfantesCreator extends CreatorPasaje{

    @Override
    public PasajeInfantes create() {
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

    @Override
    public String pedirDato(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato para "+mensaje+": ");
        String respuesta = scanner.nextLine();
        return respuesta;
    }

}