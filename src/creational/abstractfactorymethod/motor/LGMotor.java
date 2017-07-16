package creational.abstractfactorymethod.motor;

import creational.abstractfactorymethod.Direction;
import creational.abstractfactorymethod.door.Door;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// LG Motor∏¶ ±∏µø Ω√≈¥
		System.out.println("LGMotor move " + direction.toString());
	}
}