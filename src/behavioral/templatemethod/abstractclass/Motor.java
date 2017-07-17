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

	// LGMotor�� HyundaiMotor���� ����Ǵ� �κи��� ����
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		// Template Method -> ���� Ŭ�������� ���� ����
		moveMotor(direction); // �� �޼���� HyundaiMotor�� LGMotor���� Ư��ȭ(�������̵�) ��
		setMotorStatus(MotorStatus.MOVING);
	}

	// Template Method ����
	protected abstract void moveMotor(Direction direction);
}