package singleton.practice;

import java.io.*;

public class Logger {
    private static Logger instance = null;
    private Producto productos[];
    private float DineroDisponible;

    private String archivoTXT;
    private String directorio = System.getProperty("user.dir");
    private Logger(){
        productos = new Producto[5];
        for(int i=0;i<5;i++){
            productos[i] = 
            new Producto(i+1,5,(i+1)*2);
        }
        DineroDisponible = 1000;
        archivoTXT = "compilacion"+this.hashCode()+".txt";
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new Logger();
    }

    public static Logger getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void ObtenerProducto(int IDProducto, int cantidad, Promocion promocion){
        if(cantidad<=productos[IDProducto-1].getCantidad() && 
        DineroDisponible>=productos[IDProducto-1].getPrecio()*cantidad){
            
            productos[IDProducto-1]
            .setCantidad(productos[IDProducto-1].getCantidad()-cantidad);
            
            DineroDisponible-=
            (productos[IDProducto-1].getPrecio()*cantidad)*
            (promocion.getDescuento());

            imprimir("\nSaldo Cobrado: "
            +(productos[IDProducto-1].getPrecio()*cantidad)*(promocion.getDescuento())+
            "\nSaldo actual: "+DineroDisponible);
        }else{
            imprimir("Error: Producto no disponible o saldo no suficiente");
        }
    }

    public void imprimir(String mensaje){
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

    public void saldoDisponible(){
        Logger.getInstance().imprimir("Su saldo es: "+DineroDisponible);
    }

}
