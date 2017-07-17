package creational.abstractfactory.concreteproduct;

import creational.abstractfactory.abstractproduct.Door;

public class SamsungDoor extends Door {
	@Override
	protected void doClose() {
		System.out.println("close Samsung Door");
	}

	@Override
	protected void doOpen() {
		System.out.println("open Samsung Door");
	}
}