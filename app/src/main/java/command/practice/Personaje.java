package command.practice;

public class Personaje {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private int vida;
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    private int resistencia;
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    private int magia;
    public int getMagia() {
        return magia;
    }
    public void setMagia(int magia) {
        this.magia = magia;
    }
    
    public Personaje(String nombre, int vida, int resistencia, int magia) {
        this.nombre = nombre;
        this.vida = vida;
        this.resistencia = resistencia;
        this.magia = magia;
    }

    public void golpear(){
        if(this.getVida()>0){
            if(this.getResistencia()>0){
                mensaje("ATAQUE!");
                this.setResistencia(this.getResistencia()-5);
            }else{
                mensaje("NO TENGO RESISTENCIA!");
            }
        }else{
            mensaje("ESTOY ACABADO!");
        }
    }

    public void saltar(){
        if(this.getVida()>0){
            if(this.getResistencia()>0){
                mensaje("SALTO ESPACIAL!");
                this.setResistencia(this.getResistencia()-3);
            }else{
                mensaje("NO TENGO RESISTENCIA!");
            }
        }else{
            mensaje("ESTOY ACABADO!");
        }
    }

    public void protegerse(){
        if(this.getVida()>0){
            if(this.getResistencia()>0){
                mensaje("PROTEGIENDOME!");  
                this.setResistencia(this.getResistencia()-5);
                this.setVida(this.getVida()-(int)(Math.random()*5));
            }else{
                mensaje("NO TENGO RESISTENCIA!");  
            }
        }else{
            mensaje("ESTOY ACABADO!");  
        }
    }

    public void curarse(){
        if(this.getVida()>0){
            if(this.getMagia()>0){
                mensaje("CURANDOME!");
                this.setMagia(this.getMagia()-5);
                this.setVida(this.getVida()+5);
                this.setResistencia(this.getResistencia()+3);
            }else{
                mensaje("NO TENGO MAGIA!");
            }
        }else{
            mensaje("ESTOY ACABADO!");
        }
    }

    public void correr(){
        if(this.getVida()>0){
            if(this.getResistencia()>0){
                mensaje("CARRERA ESPACIAL!");
                this.setResistencia(this.getResistencia()-3);
            }else{
                mensaje("NO TENGO RESISTENCIA!");
            }
        }else{
            mensaje("ESTOY ACABADO!");
        }
    }

    public void mensaje(String msg){
        System.out.println("------------");
        System.out.println(msg);
        System.out.println("------------");
    }

    public void showInfo(){
        System.out.println("\n--- INFO ---");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Vida: "+this.getVida());
        System.out.println("Resistencia: "+this.getResistencia());
        System.out.println("Magia: "+this.getMagia());
    }
}
