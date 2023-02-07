package singleton.template;

public class Singleton1 {
    // FORMA 1:
    // se lo puede borrar y crear cuando sea

    private static Singleton1 instance = null;

    //2) constructor private
    private Singleton1(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }
    // global access
    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
    
    public void getName(){
        System.out.println("singleton ..");
    }
}
