package creational.abstractfactorymethod;

public class ElevatorFactoryFactory { // ���丮 Ŭ������ ���丮 �޼��� ������ ������
    public static ElevatorFactory getFactory(VendorID vendorID) {
        ElevatorFactory factory = null;
 
        switch (vendorID) {
        case LG:
            factory = LGElevatorFactory.getInstacne(); // LG ���丮�� ����
            break;
        case HYUNDAI:
            factory = HyundaiElevatorFactory.getInstacne(); // ���� ���丮�� ����
            break;
        case SAMSUNG:
            factory = SamsungElevatorFactory.getInstacne(); // �Ｚ ���丮�� ����
            break;
        }
        return factory;
    }
}