package creational.factorymethod;

public abstract class Factory {

	public Product create(Type type){
		Product product = createConcreteProduct(type);
		return product;
	}
	
	// template method
	public abstract Product createConcreteProduct(Type type);
}
