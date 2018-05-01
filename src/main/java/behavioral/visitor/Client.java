package behavioral.visitor;

import behavioral.visitor.concreteelement.ConcreteElementA;
import behavioral.visitor.concreteelement.ConcreteElementB;
import behavioral.visitor.concretevisitor.ConcreteVisitorA;
import behavioral.visitor.concretevisitor.ConcreteVisitorB;
import behavioral.visitor.element.Element;
import behavioral.visitor.visitor.Visitor;

public class Client {
    public static void main(String args[]) {
        Visitor visitor1 = new ConcreteVisitorA();
        Visitor visitor2 = new ConcreteVisitorB();
        Element element1 = new ConcreteElementA();
        Element element2 = new ConcreteElementB();

        element1.accept(visitor1);
        element2.accept(visitor1);

        element1.accept(visitor2);
        element2.accept(visitor2);
    }
}