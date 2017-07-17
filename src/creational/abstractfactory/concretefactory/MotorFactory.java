package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;
import creational.abstractfactory.concreteproduct.HyundaiMotor;
import creational.abstractfactory.concreteproduct.LGMotor;
import creational.abstractfactory.concreteproduct.SamsungMotor;

public class MotorFactory { // ���丮 �޼��� ������ ���
	// VendorID�� ���� Motor ��ü�� ������
	public static Motor createMotor(VendorID vendorID) {
		Motor motor = null;
		Door door = DoorFactory.createDoor(vendorID);

		switch (vendorID) {
		case LG:
			motor = new LGMotor(door);
			break;
		case HYUNDAI:
			motor = new HyundaiMotor(door);
			break;
		case SAMSUNG:
			motor = new SamsungMotor(door);
			break;
		}
		return motor;
	}
}