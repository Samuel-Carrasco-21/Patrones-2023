package prototype.example;

public class EntradaStadium{
    
    private Equipo equipoLocal;
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }



    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }



    private Equipo equipoVisitante;
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }



    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }



    private int numeroAsiento;
    public int getNumeroAsiento() {
        return numeroAsiento;
    }



    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }



    private String fecha;
    public String getFecha() {
        return fecha;
    }



    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    private String lugar;
    public String getLugar() {
        return lugar;
    }



    public void setLugar(String lugar) {
        this.lugar = lugar;
    }



    private Stadium stadium;
    public Stadium getStadium() {
        return stadium;
    }



    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }



    private String precioEntrada;
    public String getPrecioEntrada() {
        return precioEntrada;
    }



    public void setPrecioEntrada(String precioEntrada) {
        this.precioEntrada = precioEntrada;
    }



    private Persona persona;


    
    public Persona getPersona() {
        return persona;
    }



    public void setPersona(Persona persona) {
        this.persona = persona;
    }



    public EntradaStadium(Equipo equipoLocal, Equipo equipoVisitante,Stadium stadium) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.stadium = stadium;
    }

    @Override
    public EntradaStadium clone(){
        EntradaStadium clone = 
        new EntradaStadium(this.equipoLocal, 
        this.equipoVisitante,
        this.stadium);

        clone.setFecha(this.getFecha());
        clone.setLugar(this.getLugar());
        clone.setNumeroAsiento(this.getNumeroAsiento());
        clone.setPersona(this.getPersona());
        clone.setPrecioEntrada(this.getPrecioEntrada());

        return clone;
    }
}
