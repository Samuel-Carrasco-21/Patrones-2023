package abstractFactory.practice;

public class AsientoTomado {
    private static AsientoTomado asientoTomado;
    private AsientoTomado(){
        pasajerosAbordo = 0;
    }

    private int pasajerosAbordo;
    public int getPasajerosAbordo() {
        return pasajerosAbordo;
    }
    public void setPasajerosAbordo(int pasajerosAbordo) {
        this.pasajerosAbordo = pasajerosAbordo;
    }

    public static AsientoTomado getInstance(){
        if(asientoTomado==null){
            asientoTomado = new AsientoTomado();
        }
        return asientoTomado;
    }
}
