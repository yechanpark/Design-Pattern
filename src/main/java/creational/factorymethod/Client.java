package creational.factorymethod;

import creational.factorymethod.concretefactory.ConcreteFactory;
import creational.factorymethod.factory.Factory;
import creational.factorymethod.product.Product;

public class Client {
	public static void main(String args[]){
		Factory factory = new ConcreteFactory();
		Product product1 = factory.create(Type.ONE);
		Product product2 = factory.create(Type.TWO);
		product1.use();
		product2.use();
	}
}