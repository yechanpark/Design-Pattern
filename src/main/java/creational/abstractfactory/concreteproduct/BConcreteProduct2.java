package creational.abstractfactory.concreteproduct;

import creational.abstractfactory.abstractproduct.AbstractProduct2;

public class BConcreteProduct2 extends AbstractProduct2 {
	protected void do3Primitive() {
		System.out.println(this.getClass().getSimpleName() + "# do3Primitive()");
	}
}