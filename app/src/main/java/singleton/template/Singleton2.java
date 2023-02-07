package singleton.template;

public class Singleton2 {
    // FORMA 2:
    // no se lo puede borrar ni crear cuando sea
    // se lo debe crear solo una vez y ya

    //1) attribute same type
    private static final Singleton2 instance = new Singleton2();

    //2) constructor private
    private Singleton2(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }
    // global access
    public static Singleton2 getInstance(){
       return instance;
    }

    public void getName(){
        System.out.println("singleton ..");
    }
}
