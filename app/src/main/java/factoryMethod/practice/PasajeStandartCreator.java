package factoryMethod.practice;

import java.util.Scanner;

public class PasajeStandartCreator extends CreatorPasaje{
    @Override
    public PasajeStandart create() {
//   numero vuelo
//   destino (pais, ciudad, aeropuerto)
//   origen (pais, ciudad, aeropuerto)
//   avion (marca,capacidad, modelo, numerodeAsientos)
//   pasajero (nombre,ci)
//   numero asiento
//   costo de pasaje
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

    @Override
    public String pedirDato(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato para "+mensaje+": ");
        String respuesta = scanner.nextLine();
        return respuesta;
    }

}