package visitor.template;

public class Client {
    public static void main(String[] args) {
        ConcreteObject1 concreteObject1 = new ConcreteObject1();
        ConcreteObject2 concreteObject2 = new ConcreteObject2();

        ConcreteVisitor visitor = new ConcreteVisitor();

        concreteObject1.accept(visitor);
        concreteObject2.accept(visitor);
    }
}
