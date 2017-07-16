package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.VendorID;
import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.door.HyundaiDoor;
import creational.abstractfactorymethod.motor.HyundaiMotor;
import creational.abstractfactorymethod.motor.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {
	private static ElevatorFactory factory;

	private HyundaiElevatorFactory() {
	}

	public static ElevatorFactory getInstance() {
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
