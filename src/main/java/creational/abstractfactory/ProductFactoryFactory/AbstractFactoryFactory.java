package creational.abstractfactory.ProductFactoryFactory;

import creational.abstractfactory.concretefactory.AConcreteFactory;
import creational.abstractfactory.concretefactory.BConcreteFactory;
import creational.abstractfactory.type.VendorID;
import creational.abstractfactory.abstractfactory.AbstractFactory;

// Factory Method Pattern 사용
// ConcreteProductFactory를 생성해내는 Factory
public class AbstractFactoryFactory {

	// VendorID에 따라 ConcreteFactory를 생성하여 추상적 개념인 AbstractFactory 타입으로 반환
	public static AbstractFactory getFactory(VendorID vendorID) {
		AbstractFactory factory = null;

		switch (vendorID) {
		case A:
			factory = AConcreteFactory.getInstance(); // A 팩토리 생성
			break;
		case B:
			factory = BConcreteFactory.getInstance(); // B 팩토리 생성
			break;
		}
		return factory;
	}
}