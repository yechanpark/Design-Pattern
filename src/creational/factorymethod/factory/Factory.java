package creational.factorymethod.factory;

import creational.factorymethod.Type;
import creational.factorymethod.product.Product;

public abstract class Factory {

	public Product create(Type type){
		Product product = createConcreteProduct(type);
		return product;
	}
	
	// template method
	public abstract Product createConcreteProduct(Type type);
}
