package creational.abstractfactorymethod;

public class ElevatorFactoryFactory { // 팩토리 클래스에 팩토리 메서드 패턴을 적용함
    public static ElevatorFactory getFactory(VendorID vendorID) {
        ElevatorFactory factory = null;
 
        switch (vendorID) {
        case LG:
            factory = LGElevatorFactory.getInstacne(); // LG 팩토리의 생성
            break;
        case HYUNDAI:
            factory = HyundaiElevatorFactory.getInstacne(); // 현대 팩토리의 생성
            break;
        case SAMSUNG:
            factory = SamsungElevatorFactory.getInstacne(); // 삼성 팩토리의 생성
            break;
        }
        return factory;
    }
}