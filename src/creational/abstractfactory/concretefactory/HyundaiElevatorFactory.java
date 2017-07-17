package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractfactory.DoorFactory;
import creational.abstractfactory.abstractfactory.ElevatorAbstractFactory;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;
import creational.abstractfactory.concreteproduct.HyundaiDoor;
import creational.abstractfactory.concreteproduct.HyundaiMotor;

public class HyundaiElevatorFactory extends ElevatorAbstractFactory {
	private static ElevatorAbstractFactory factory;

	private HyundaiElevatorFactory() {
	}

	public static ElevatorAbstractFactory getInstance() {
		if (factory == null)
			factory = new HyundaiElevatorFactory();

		return factory;
	}

	@Override
	public Motor createMotor() {
		return new HyundaiMotor(DoorFactory.createDoor(VendorID.HYUNDAI));
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}
}
