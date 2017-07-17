package creational.abstractfactory.abstractfactory;

import creational.abstractfactory.VendorID;
import creational.abstractfactory.concretefactory.HyundaiElevatorFactory;
import creational.abstractfactory.concretefactory.LGElevatorFactory;
import creational.abstractfactory.concretefactory.SamsungElevatorFactory;

public class ElevatorFactoryFactory { // 팩토리 메서드 패턴을 사용
	// VendorID에 따라 ElevatorFactory 객체를 생성함
	public static ElevatorFactory getFactory(VendorID vendorID) {
		ElevatorFactory factory = null;

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