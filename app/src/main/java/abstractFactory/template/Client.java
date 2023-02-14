package abstractFactory.template;

public class Client {
    public static void main(String[] args) {
        String dato = "ProductB";

        // forma 1:
        IProduct concreteProduct = AbstractFactory.make(dato);
        concreteProduct.methodA();
        concreteProduct.methodB();
        concreteProduct.methodC();

        // forma 2:
        AbstractFactory.make(dato).methodA();
        AbstractFactory.make(dato).methodB();
        AbstractFactory.make(dato).methodC();

    }
}
