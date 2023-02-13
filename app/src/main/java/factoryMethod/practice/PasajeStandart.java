package factoryMethod.practice;

public class PasajeStandart implements IPasaje{
    // numero vuelo
    // destino (pais, ciudad, aeropuerto)
    // origen (pais, ciudad, aeropuerto)
    // avion (marca,capacidad, modelo, numerodeAsientos)
    // pasajero (nombre,ci)
    // numero asiento
    // costo de pasaje

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

    private int costoPasaje;
    public int getCostoPasaje() {
        return costoPasaje;
    }
    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }

    public PasajeStandart(){}

    @Override
    public void crearPasaje() {
        System.out.println("--- CREANDO NUEVO PASAJE STANDART ---");
    }

    @Override
    public void mostrarPasaje() {
        System.out.println("\nPASAJE STANDART");
        System.out.println("Vuelo: "+vuelo);
        destino.showInf();
        origen.showInf();
        avion.showInf();
        pasajero.showInf();
        System.out.println("Numero Asiento: "+numeroAsiento);
        System.out.println("Costo Pasaje: "+costoPasaje+"$us");
    }

}