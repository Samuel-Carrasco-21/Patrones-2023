package abstractFactory.practice;

public class Origen{
    private String pais;
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    private String ciudad;
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    private String aeropuerto;
    public String getAeropuerto() {
        return aeropuerto;
    }
    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void showInf(){
        System.out.println("Destino > pais: "+pais);
        System.out.println("Destino > ciudad: "+ciudad);
        System.out.println("Destino > aeropuerto: "+aeropuerto);
    }
}