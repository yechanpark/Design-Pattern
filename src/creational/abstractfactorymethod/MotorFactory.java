package creational.abstractfactorymethod;

public class MotorFactory { // ���丮 �޼��� ������ ���
    // VendorID�� ���� LGMotor �Ǵ� HyundaiMotor ��ü�� ������
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