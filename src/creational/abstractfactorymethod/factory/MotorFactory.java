package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.VendorID;
import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.motor.HyundaiMotor;
import creational.abstractfactorymethod.motor.LGMotor;
import creational.abstractfactorymethod.motor.Motor;
import creational.abstractfactorymethod.motor.SamsungMotor;

public class MotorFactory { // ���丮 �޼��� ������ ���
    // VendorID�� ���� LGMotor �Ǵ� HyundaiMotor ��ü�� ������
    public static Motor createMotor(VendorID vendorID) {
        Motor motor = null;
        Door door = DoorFactory.createDoor(vendorID);
        
        switch (vendorID) {
        case LG:
            motor = new LGMotor(door);
            break;
        case HYUNDAI:
            motor = new HyundaiMotor(door);
            break;
        case SAMSUNG:
        	motor = new SamsungMotor(door);
            break;
        }
        return motor;
    }
}