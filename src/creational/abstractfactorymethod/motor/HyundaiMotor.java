package creational.abstractfactorymethod.motor;

import creational.abstractfactorymethod.Direction;
import creational.abstractfactorymethod.door.Door;

public class HyundaiMotor extends Motor {
	public HyundaiMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// Hyundai Motor∏¶ ±∏µøΩ√≈¥
		System.out.println("HyundaiMotor move " + direction.toString());
	}
}