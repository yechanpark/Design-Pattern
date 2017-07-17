package creational.factorymethod.concretefactory;

import creational.factorymethod.Type;
import creational.factorymethod.concreteproduct.ConcreteProductOne;
import creational.factorymethod.concreteproduct.ConcreteProductTwo;
import creational.factorymethod.factory.Factory;
import creational.factorymethod.product.Product;

public class ConcreteFactory extends Factory {

	@Override
	public Product createConcreteProduct(Type type) {
		Product product = null;

		switch (type) {
		case ONE:
			product = new ConcreteProductOne();
			break;
		case TWO:
			product = new ConcreteProductTwo();
			break;
		}

		return product;
	}
}