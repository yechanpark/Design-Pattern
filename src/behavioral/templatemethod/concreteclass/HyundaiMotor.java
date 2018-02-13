package behavioral.templatemethod.concreteclass;

import behavioral.templatemethod.Direction;
import behavioral.templatemethod.Door;
import behavioral.templatemethod.abstractclass.Motor;

public class HyundaiMotor extends Motor {
	public HyundaiMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// Hyundai Motor를 구동시킴
		System.out.println("HyundaiMotor move " + direction.toString());
	}
}