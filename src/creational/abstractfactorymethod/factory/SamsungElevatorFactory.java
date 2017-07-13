package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.VendorID;
import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.door.SamsungDoor;
import creational.abstractfactorymethod.motor.Motor;
import creational.abstractfactorymethod.motor.SamsungMotor;

public class SamsungElevatorFactory extends ElevatorFactory { // �Ｚ ��ǰ�� �����ϴ� �Ｚ ���丮
	 private static ElevatorFactory factory;
	 private SamsungElevatorFactory() { }

	 public static ElevatorFactory getInstance() {
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