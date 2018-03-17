package creational.abstractfactory.concreteproduct;

import creational.abstractfactory.abstractproduct.AbstractProduct1;

public class BConcreteProduct1 extends AbstractProduct1 {
	@Override
	protected void do1Primitive() {
		System.out.println("BConcreteProduct1# do1Primitive()");
	}

	@Override
	protected void do2Primitive() {
		System.out.println("BConcreteProduct1# do2Primitive()");
	}
}