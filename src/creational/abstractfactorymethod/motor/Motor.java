package creational.abstractfactorymethod.motor;

import creational.abstractfactorymethod.Direction;
import creational.abstractfactorymethod.door.Door;
import creational.abstractfactorymethod.door.DoorStatus;

public abstract class Motor {
	protected Door door;
	private MotorStatus motorStatus;

	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	// LGMotor와 HyundaiMotor의 move()에서 공통되는 부분만을 가짐
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		moveMotor(direction); // 이 메서드는 HyundaiMotor와 LGMotor에서 특수화(오버라이드) 됨
		setMotorStatus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor(Direction direction);
}