package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.VendorID;

public class ElevatorFactoryFactory { // ���丮 Ŭ������ ���丮 �޼��� ������ ������
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