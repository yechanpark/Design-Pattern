package creational.abstractfactory.abstractfactory;

import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;

public abstract class ElevatorAbstractFactory { // 추상 부품을 생성하는 추상 팩토리
	public abstract Motor createMotor();

	public abstract Door createDoor();
}