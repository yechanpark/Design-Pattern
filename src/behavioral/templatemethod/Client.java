package behavioral.templatemethod;

import behavioral.templatemethod.abstractclass.Motor;
import behavioral.templatemethod.concreteclass.HyundaiMotor;
import behavioral.templatemethod.concreteclass.LGMotor;

public class Client {
	public static void main(String[] args) {
		Door door = new Door();
		Motor motor1 = new HyundaiMotor(door);
		Motor motor2 = new LGMotor(door);
		motor1.move(Direction.UP);
		motor2.move(Direction.DOWN);
	}
}