package prototype.practice;

import java.io.*;

public class SamsungR10 implements ISamsungR10{
    private int tamano;
    private String archivoTXT="compilacion.txt";
    private String directorio = System.getProperty("user.dir");
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    private String cpu;
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    private int memory;
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    private Sim sim;
    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    private float versionAndroid;
    public float getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(float versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    private int camara;
    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    private boolean bluetoo;
    public boolean isBluetoo() {
        return bluetoo;
    }

    public void setBluetoo(boolean bluetoo) {
        this.bluetoo = bluetoo;
    }

    private int cantidadDeMemoriasExternas;
    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    private int tiempoUsoBateria;
    public int getTiempoUsoBateria() {
        return tiempoUsoBateria;
    }

    public void setTiempoUsoBateria(int tiempoUsoBateria) {
        this.tiempoUsoBateria = tiempoUsoBateria;
    }

    private Accesorios accesorios;

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    public SamsungR10(int tamano, String cpu, int memory, float versionAndroid, int camara, boolean bluetoo,
            int cantidadDeMemoriasExternas, int tiempoUsoBateria, Accesorios accesorios) {
        this.tamano = tamano;
        this.cpu = cpu;
        this.memory = memory;
        this.versionAndroid = versionAndroid;
        this.camara = camara;
        this.bluetoo = bluetoo;
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
        this.tiempoUsoBateria = tiempoUsoBateria;
        this.accesorios = accesorios;
    }

    @Override
    public SamsungR10 clone(){
        SamsungR10 clone = new 
        SamsungR10(this.tamano, 
        this.cpu, 
        this.memory, 
        this.versionAndroid, 
        this.camara, this.bluetoo, 
        this.cantidadDeMemoriasExternas, 
        this.tiempoUsoBateria, 
        this.accesorios);
        clone.setSim(this.getSim());

        return clone;
    }

    public void mostrarDatos(){
        SamsungR10.this
        .imprimir("\n--- DATOS TELEFONO ---\n");
        SamsungR10.this
        .imprimir("Tamano: "+getTamano()+"cm");
        SamsungR10.this
        .imprimir("CPU: "+getCpu());
        SamsungR10.this
        .imprimir("Memory: "+getMemory()+"GB");
        SamsungR10.this
        .imprimir("Empresa telefonica: "+getSim().getNombreEmpresaTel()
        +"\nNumero telefonico: "+getSim().getNumeroTelefono());
        SamsungR10.this
        .imprimir("Version Android: "+getVersionAndroid());
        SamsungR10.this
        .imprimir("Camara: "+getCamara()+"MP");
        SamsungR10.this
        .imprimir("Bluetoo: "+isBluetoo());
        SamsungR10.this
        .imprimir("Cantidad de memorias externas: "+getCantidadDeMemoriasExternas());
        SamsungR10.this
        .imprimir("Duracion Bateria: "+getTiempoUsoBateria()+"h");
        SamsungR10.this
        .imprimir("Accesorios:\n"
        +getAccesorios().getAudifonos()+"\n"
        +getAccesorios().getCargador()+"\n"
        +getAccesorios().getEstuche());
        SamsungR10.this
        .imprimir("\n----------------------\n");
        
        SamsungR10.this
        .imprimir("--- Datos Usuario ---");
        SamsungR10.this
        .imprimir("nombre: "+getSim().getOwner().getNombre());
        SamsungR10.this
        .imprimir("id: "+getSim().getOwner().getId());
        SamsungR10.this
        .imprimir("*********************");
    
    }

    public synchronized void imprimir(String mensaje){
        File archivo_txt = new File(directorio, archivoTXT);
        if(!archivo_txt.exists()){
            try{
                System.out.println("Archivo creado en: "+directorio);
                archivo_txt.createNewFile();
            } catch (IOException errorDeCreacionArchivo){
                System.out.println("Error: archivo no creado");
            }
        }
        try{
            FileWriter salida = new FileWriter(archivo_txt,true);
            salida.write((mensaje+"\n").toCharArray());
            salida.close();
        }catch(IOException archivoInexistente){
            System.out.println("Error: no fue posible escribir en el archivo");
        }
    }

}
