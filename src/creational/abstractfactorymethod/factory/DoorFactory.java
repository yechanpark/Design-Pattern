package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.VendorID;
import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.door.HyundaiDoor;
import creational.abstractfactorymethod.door.LGDoor;
import creational.abstractfactorymethod.door.SamsungDoor;

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