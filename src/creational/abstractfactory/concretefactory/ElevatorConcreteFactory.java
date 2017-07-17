package creational.abstractfactory.concretefactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.abstractfactory.ElevatorAbstractFactory;

public class ElevatorConcreteFactory { // 팩토리 메서드 패턴을 사용
	// VendorID에 따라 ElevatorFactory 객체를 생성함
	public static ElevatorAbstractFactory getFactory(VendorID vendorID) {
		ElevatorAbstractFactory factory = null;

		switch (vendorID) {
		case LG:
			factory = LGElevatorFactory.getInstance(); // LG 팩토리의 생성
			break;
		case HYUNDAI:
			factory = HyundaiElevatorFactory.getInstance(); // 현대 팩토리의 생성
			break;
		case SAMSUNG:
			factory = SamsungElevatorFactory.getInstance(); // 삼성 팩토리의 생성
			break;
		}
		return factory;
	}
}