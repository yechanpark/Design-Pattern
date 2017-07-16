package creational.abstractfactorymethod.factory;

import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.motor.Motor;

public abstract class ElevatorFactory { // 추상 부품을 생성하는 추상 팩토리
	public abstract Motor createMotor();

	public abstract Door createDoor();
}