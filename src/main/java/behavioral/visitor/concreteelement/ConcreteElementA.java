package behavioral.visitor.concreteelement;

import behavioral.visitor.element.Element;
import behavioral.visitor.visitor.Visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println(this.getClass().getSimpleName() + "# accept(" + visitor.getClass().getSimpleName() + " visitor)");

        // Double Dispatching
        visitor.visit(this);
    }
}
