package creational.factorymethod.factory;

import creational.factorymethod.Type;
import creational.factorymethod.product.Product;

public abstract class Factory {

	// Template method
	public Product create(Type type){
		Product product = createConcreteProduct(type);
		return product;
	}

	// Primitive Method, Factory Method
	public abstract Product createConcreteProduct(Type type);
}
