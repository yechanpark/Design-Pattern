package creational.abstractfactory.concreteproduct;

import creational.abstractfactory.Direction;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;

public class SamsungMotor extends Motor {
	public SamsungMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// Samsung Motor를 구동 시킴
		System.out.println("SamsungMotor move " + direction.toString());
	}
}