package visitor.template;

public class ConcreteObject1 implements IConcreteInterface,IElement{

    @Override
    public void method1() {
        System.out.println("Concrete Object 1 > method 1");
    }

    @Override
    public void method2() {
        System.out.println("Concrete Object 1 > method 2");
    }

    @Override
    public void method3() {
        System.out.println("Concrete Object 1 > method 3");
    }

    @Override
    public void accept(IVisit visit) {
        System.out.println("Concrete Object 1 > accept 1");
    }
    
}
