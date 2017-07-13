package creational.abstractfactorymethod;

public class MotorFactory { // 팩토리 메서드 패턴을 사용
    // VendorID에 따라 LGMotor 또는 HyundaiMotor 객체를 생성함
    public static Motor createMotor(VendorID vendorID) {
        Motor motor = null;
        switch (vendorID) {
        case LG:
            motor = new LGMotor();
            break;
        case Hyundai:
            motor = new Hyundai();
            break;
        }
        return motor;
    }
}