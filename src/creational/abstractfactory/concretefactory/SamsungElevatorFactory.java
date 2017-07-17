package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractfactory.DoorFactory;
import creational.abstractfactory.abstractfactory.ElevatorAbstractFactory;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;
import creational.abstractfactory.concreteproduct.SamsungDoor;
import creational.abstractfactory.concreteproduct.SamsungMotor;

public class SamsungElevatorFactory extends ElevatorAbstractFactory { // 伙己 何前阑 积己窍绰 伙己
																// 蒲配府
	private static ElevatorAbstractFactory factory;

	private SamsungElevatorFactory() {
	}

	public static ElevatorAbstractFactory getInstance() {
		if (factory == null)
			factory = new SamsungElevatorFactory();

		return factory;
	}

	@Override
	public Motor createMotor() {
		return new SamsungMotor(DoorFactory.createDoor(VendorID.SAMSUNG));
	}

	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}
}