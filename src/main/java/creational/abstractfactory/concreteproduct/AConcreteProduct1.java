package creational.abstractfactory.concreteproduct;

import creational.abstractfactory.abstractproduct.AbstractProduct1;

public class AConcreteProduct1 extends AbstractProduct1 {
	@Override
	protected void do1Primitive() {
		System.out.println("AConcreteProduct1# do1Primitive()");
	}

	@Override
	protected void do2Primitive() {
		System.out.println("AConcreteProduct1# do2Primitive()");
	}
}