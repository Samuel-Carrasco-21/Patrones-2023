package singleton.Practica;

public class Logger {
    private static Logger instance = null;
    
    private Logger(){
        Producto producto;
        Promocion promocion;
        Clientes clientes;
        System.out.println("Sesion iniciada");
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new Logger();
        }
    }

    public static Logger getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }

    public static void deleteInstance(){
        instance = null;
    }
}
