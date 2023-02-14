package factoryMethod.practice;

import java.util.Scanner;

public class PasajeSolidarioCreator extends CreatorPasaje{
//   numero vuelo
//   destino (pais, ciudad, aeropuerto)
//   origen (pais, ciudad, aeropuerto)
//   avion (marca,capacidad, modelo, numerodeAsientos)
//   pasajero (nombre,ci)
//   numero asiento
//   costo de pasaje
//   descuento
//   motivo del descuento

    @Override
    public PasajeSolidario create() {
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

    @Override
    public String pedirDato(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dato para "+mensaje+": ");
        String respuesta = scanner.nextLine();
        return respuesta;
    }

}