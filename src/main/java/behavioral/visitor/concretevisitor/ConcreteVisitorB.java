package behavioral.visitor.concretevisitor;

import behavioral.visitor.concreteelement.ConcreteElementA;
import behavioral.visitor.concreteelement.ConcreteElementB;
import behavioral.visitor.visitor.Visitor;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println(this.getClass().getSimpleName()
                + "# visit(" + concreteElementA.getClass().getSimpleName() + " concreteElementA)");
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println(this.getClass().getSimpleName()
                + "# visit(" + concreteElementB.getClass().getSimpleName() + " concreteElementB)");
    }
}
