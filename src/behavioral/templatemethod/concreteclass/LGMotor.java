package behavioral.templatemethod.concreteclass;

import behavioral.templatemethod.Direction;
import behavioral.templatemethod.Door;
import behavioral.templatemethod.abstractclass.Motor;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// LG Motor를 구동 시킴
		System.out.println("LGMotor move " + direction.toString());
	}
}