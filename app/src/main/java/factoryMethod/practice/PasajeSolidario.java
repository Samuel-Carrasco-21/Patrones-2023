package factoryMethod.practice;

public class PasajeSolidario implements IPasaje{
//   numero vuelo
//   destino (pais, ciudad, aeropuerto)
//   origen (pais, ciudad, aeropuerto)
//   avion (marca,capacidad, modelo, numerodeAsientos)
//   pasajero (nombre,ci)
//   numero asiento
//   costo de pasaje
//   descuento
//   motivo del descuento

private int vuelo;
public int getVuelo() {
    return vuelo;
}

public void setVuelo(int vuelo) {
    this.vuelo = vuelo;
}

private Destino destino = new Destino();
public Destino getDestino() {
    return destino;
}

public void setDestino(Destino destino) {
    this.destino = destino;
}

private Origen origen = new Origen();
public Origen getOrigen() {
    return origen;
}

public void setOrigen(Origen origen) {
    this.origen = origen;
}

private Avion avion = new Avion();
public Avion getAvion() {
    return avion;
}

public void setAvion(Avion avion) {
    this.avion = avion;
}

private Pasajero pasajero = new Pasajero();
public Pasajero getPasajero() {
    return pasajero;
}

public void setPasajero(Pasajero pasajero) {
    this.pasajero = pasajero;
}

private int numeroAsiento;
public int getNumeroAsiento() {
    return numeroAsiento;
}

public void setNumeroAsiento(int numeroAsiento) {
    this.numeroAsiento = numeroAsiento;
}

private float costoPasaje;
public float getCostoPasaje() {
    return costoPasaje;
}
public void setCostoPasaje(float costoPasaje) {
    this.costoPasaje = costoPasaje;
}

private int descuento;
public int getDescuento() {
    return descuento;
}
public void setDescuento(int descuento) {
    this.descuento = descuento;
}

private String motivoDescuento;
public String getMotivoDescuento() {
    return motivoDescuento;
}
public void setMotivoDescuento(String motivoDescuento) {
    this.motivoDescuento = motivoDescuento;
}

public PasajeSolidario(){}

    @Override
    public void crearPasaje() {
        System.out.println("--- CREANDO NUEVO PASAJE SOLIDARIO ---");
        
    }

    @Override
    public void mostrarPasaje() {
        System.out.println("\nPASAJE SOLIDARIO");
        System.out.println("Vuelo: "+vuelo);
        destino.showInf();
        origen.showInf();
        avion.showInf();
        pasajero.showInf();
        System.out.println("Numero Asiento: "+numeroAsiento);
        System.out.println("Costo Pasaje: "+costoPasaje+"$us");
        System.out.println("Descuento: "+descuento+"%");
        float costoNuevo = costoPasaje*((float)1-descuento/(float)100);
        System.out.println(
            "Nuevo Costo Pasaje: "+costoNuevo+"$us");
        System.out.println("Motivo del Descuento: "+motivoDescuento);
    }

}