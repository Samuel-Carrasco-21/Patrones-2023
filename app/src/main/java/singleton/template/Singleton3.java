package singleton.template;

public class Singleton3 {
    private static Singleton3 instance = null;

    //2) constructor private
    private Singleton3(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new Singleton3();
        }
    }

    // global access
    public static Singleton3 getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }

}
