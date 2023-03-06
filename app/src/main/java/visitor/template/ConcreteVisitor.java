package visitor.template;

public class ConcreteVisitor implements IVisit{

    @Override
    public void visitConcreteObject1(ConcreteObject1 concreteObject1) {
        System.out.println("Visitante visita a ConcreteObject1");
        concreteObject1.method1();
        concreteObject1.method2();
        concreteObject1.method3();
    }

    @Override
    public void visitConcreteObject2(ConcreteObject2 concreteObject2) {
        System.out.println("Visitante visita a ConcreteObject2");
        concreteObject2.method1();
        concreteObject2.method2();
        concreteObject2.method3();
    }
    
}
