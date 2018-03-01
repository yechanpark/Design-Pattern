package behavioral.templatemethod.concreteclass;

import behavioral.templatemethod.abstractclass.AbstractClass;

public class ConcreteClass1 extends AbstractClass {

	// Primitive Method ( or Hook Method )
	protected void primitiveMethod() {
		System.out.println("ConcreteClass1# Primitive Method()");
	}
}