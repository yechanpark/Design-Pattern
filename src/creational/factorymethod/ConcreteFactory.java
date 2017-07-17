package creational.factorymethod;

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