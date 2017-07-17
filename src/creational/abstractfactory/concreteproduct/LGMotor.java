package creational.abstractfactory.concreteproduct;

import creational.abstractfactory.Direction;
import creational.abstractfactory.abstractproduct.Door;
import creational.abstractfactory.abstractproduct.Motor;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// LG Motor∏¶ ±∏µø Ω√≈¥
		System.out.println("LGMotor move " + direction.toString());
	}
}