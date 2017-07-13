package creational.abstractfactorymethod;

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