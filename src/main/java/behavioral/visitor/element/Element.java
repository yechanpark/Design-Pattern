package behavioral.visitor.element;

import behavioral.visitor.visitor.Visitor;

public interface Element {
    // Visitor를 통해 자신을 제어하기 위한, 방문자를 수용하는, 약속된 메서드.
    // Visitor가 구체적인 작업을 대행
    public void accept(Visitor visitor);
}
