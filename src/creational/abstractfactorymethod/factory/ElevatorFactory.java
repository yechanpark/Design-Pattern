package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.motor.Motor;

public abstract class ElevatorFactory { // �߻� ��ǰ�� �����ϴ� �߻� ���丮
	public abstract Motor createMotor();

	public abstract Door createDoor();
}