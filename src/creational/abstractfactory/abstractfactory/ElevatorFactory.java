package creational.abstractfactory.abstractfactory;

import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;

public abstract class ElevatorFactory { // �߻� ��ǰ�� �����ϴ� �߻� ���丮
	public abstract Motor createMotor();

	public abstract Door createDoor();
}