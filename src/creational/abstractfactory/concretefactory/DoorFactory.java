package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.concreteproduct.HyundaiDoor;
import creational.abstractfactory.concreteproduct.LGDoor;
import creational.abstractfactory.concreteproduct.SamsungDoor;

public class DoorFactory { // ���丮 �޼��� ������ �����
	// VendorID�� ���� LGDoor �Ǵ� HyundaiDoor ��ü�� ��������
	public static Door createDoor(VendorID vendorID) {
		Door door = null;
		switch (vendorID) {
		case LG:
			door = new LGDoor();
			break;
		case HYUNDAI:
			door = new HyundaiDoor();
			break;
		case SAMSUNG:
			door = new SamsungDoor();
			break;
		}
		return door;
	}

}