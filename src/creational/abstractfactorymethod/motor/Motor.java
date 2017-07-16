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

	// LGMotor�� HyundaiMotor�� move()���� ����Ǵ� �κи��� ����
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		moveMotor(direction); // �� �޼���� HyundaiMotor�� LGMotor���� Ư��ȭ(�������̵�) ��
		setMotorStatus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor(Direction direction);
}