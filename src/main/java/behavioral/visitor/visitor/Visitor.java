package behavioral.visitor.visitor;

import behavioral.visitor.concreteelement.ConcreteElementA;
import behavioral.visitor.concreteelement.ConcreteElementB;

// 요소의 형식(ElementA, ElementB)에 따라 수행할 구체적 작업을 방문자에 정의
// 각 요소마다 행동을 달리할 수 있다.
public interface Visitor {

    // 대상이 ElementA라면 이러한 로직을 수행
    public void visit(ConcreteElementA concreteElementA);

    // 대상이 ElementB라면 이러한 로직을 수행
    public void visit(ConcreteElementB concreteElementB);
}