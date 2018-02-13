package behavioral.templatemethod.abstractclass;

import behavioral.templatemethod.Direction;
import behavioral.templatemethod.Door;
import behavioral.templatemethod.DoorStatus;
import behavioral.templatemethod.MotorStatus;

public abstract class Motor {
	protected Door door;
	private MotorStatus motorStatus;

	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	// LGMotor와 HyundaiMotor에서 공통되는 부분만을 가짐
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		// Template Method -> 하위 클래스에서 각각 구현
		moveMotor(direction); // 이 메서드는 HyundaiMotor와 LGMotor에서 특수화(오버라이드) 됨
		setMotorStatus(MotorStatus.MOVING);
	}

	// Template Method 선언
	protected abstract void moveMotor(Direction direction);
}