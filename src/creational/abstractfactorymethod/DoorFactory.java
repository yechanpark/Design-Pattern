package creational.abstractfactorymethod;

public class DoorFactory { // 팩토리 메서드 패턴을 사용함
    // VendorID에 따라 LGDoor 또는 HyundaiDoor 객체를 생ㅇ성함
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