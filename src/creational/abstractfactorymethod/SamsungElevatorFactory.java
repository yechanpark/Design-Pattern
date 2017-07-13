package creational.abstractfactorymethod;

public class SamsungElevatorFactory extends ElevatorFactory { // �Ｚ ��ǰ�� �����ϴ� �Ｚ ���丮
    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }
 
    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}