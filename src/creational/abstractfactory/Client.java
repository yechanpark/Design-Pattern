package creational.abstractfactory;

import creational.abstractfactory.abstractfactory.AbstractFactory;
import creational.abstractfactory.abstractproduct.AbstractProduct1;
import creational.abstractfactory.abstractproduct.AbstractProduct2;
import creational.abstractfactory.ProductFactoryFactory.AbstractFactoryFactory;
import creational.abstractfactory.type.VendorID;

public class Client {
	public static void main(String[] args) {

		VendorID vendorID = VendorID.A;
		//VendorID vendorID = VendorID.B;

		AbstractFactory factory = AbstractFactoryFactory.getFactory(vendorID);

		AbstractProduct1 abstractProduct1 = factory.createAbstractProduct1();
		AbstractProduct2 abstractProduct2 = factory.createAbstractProduct2();

		abstractProduct1.do1();
		abstractProduct1.do2();
		abstractProduct2.do3();
	}
}