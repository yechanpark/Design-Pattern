package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractfactory.ElevatorAbstractFactory;

public class ElevatorConcreteFactory { // ���丮 �޼��� ������ ���
	// VendorID�� ���� ElevatorFactory ��ü�� ������
	public static ElevatorAbstractFactory getFactory(VendorID vendorID) {
		ElevatorAbstractFactory factory = null;

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