package creational.abstractfactory.abstractfactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.concretefactory.HyundaiElevatorFactory;
import creational.abstractfactory.concretefactory.LGElevatorFactory;
import creational.abstractfactory.concretefactory.SamsungElevatorFactory;

public class ElevatorFactoryFactory { // ���丮 �޼��� ������ ���
	// VendorID�� ���� ElevatorFactory ��ü�� ������
	public static ElevatorFactory getFactory(VendorID vendorID) {
		ElevatorFactory factory = null;

		switch (vendorID) {
		case LG:
			factory = LGElevatorFactory.getInstance(); // LG ���丮�� ����
			break;
		case HYUNDAI:
			factory = HyundaiElevatorFactory.getInstance(); // ���� ���丮�� ����
			break;
		case SAMSUNG:
			factory = SamsungElevatorFactory.getInstance(); // �Ｚ ���丮�� ����
			break;
		}
		return factory;
	}
}