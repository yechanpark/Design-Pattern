package behavioral.templatemethod;

import behavioral.templatemethod.abstractclass.AbstractClass;
import behavioral.templatemethod.concreteclass.ConcreteClass1;
import behavioral.templatemethod.concreteclass.ConcreteClass2;

public class Client {
	public static void main(String[] args) {
		AbstractClass abstractClass1 = new ConcreteClass1();
		AbstractClass abstractClass2 = new ConcreteClass2();

		abstractClass1.templateMethod();
		System.out.println();
		abstractClass2.templateMethod();

	}
}