package behavioral.templatemethod;

public class LGMotor extends Motor {
	public LGMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		// LG Motor�� ���� ��Ŵ
		System.out.println("LGMotor move " + direction.toString());
	}
}