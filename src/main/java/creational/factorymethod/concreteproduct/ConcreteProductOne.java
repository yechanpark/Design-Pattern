package creational.factorymethod.concreteproduct;

import creational.factorymethod.product.Product;

public class ConcreteProductOne extends Product {
	@Override
	public void use() {
		System.out.println("ConcreteProduct1");
	}

}