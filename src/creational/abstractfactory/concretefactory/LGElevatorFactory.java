package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractfactory.DoorFactory;
import creational.abstractfactory.abstractfactory.ElevatorFactory;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;
import creational.abstractfactory.concreteproduct.LGDoor;
import creational.abstractfactory.concreteproduct.LGMotor;

//싱글턴 패턴을 적용한 LG 팩토리
public class LGElevatorFactory extends ElevatorFactory {
	private static ElevatorFactory factory;

	private LGElevatorFactory() {
	}

	public static ElevatorFactory getInstance() {
		if (factory == null)
			factory = new LGElevatorFactory();

		return factory;
	}

	@Override
	public Motor createMotor() {
		return new LGMotor(DoorFactory.createDoor(VendorID.LG));
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}
}
