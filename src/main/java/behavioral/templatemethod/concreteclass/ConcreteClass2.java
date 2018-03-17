package behavioral.templatemethod.concreteclass;

import behavioral.templatemethod.abstractclass.AbstractClass;

public class ConcreteClass2 extends AbstractClass {

	// Primitive Method ( or Hook Method )
	protected void primitiveMethod() {
		System.out.println("ConcreteClass2# Primitive Method()");
	}
}