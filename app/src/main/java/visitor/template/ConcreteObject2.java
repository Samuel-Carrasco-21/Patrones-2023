package visitor.template;

public class ConcreteObject2 implements IConcreteInterface, IElement{

    @Override
    public void method1() {
        System.out.println("Concrete Object 2 > method 1");
    }

    @Override
    public void method2() {
        System.out.println("Concrete Object 2 > method 2");
    }

    @Override
    public void method3() {
        System.out.println("Concrete Object 2 > method 3");
    }

    @Override
    public void accept(IVisit visit) {
        System.out.println("Concrete Object 2 > accept 1");
    }
    
}
