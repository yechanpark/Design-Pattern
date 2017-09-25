package creational.abstractfactory;

import creational.abstractfactory.abstractfactory.ElevatorAbstractFactory;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;
import creational.abstractfactory.concretefactory.ElevatorConcreteFactory;

public class Client {
	// args 입력 필요
	public static void main(String[] args) {
		String vendorName = args[0];
		VendorID vendorID;

		if (vendorName.equalsIgnoreCase("LG"))
			vendorID = VendorID.LG;
		else if (vendorName.equalsIgnoreCase("SAMSUNG"))
			vendorID = VendorID.SAMSUNG;
		else
			vendorID = VendorID.HYUNDAI;

		ElevatorAbstractFactory factory = ElevatorConcreteFactory.getFactory(vendorID);

		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);

		door.open();
		motor.move(Direction.UP);
	}
}