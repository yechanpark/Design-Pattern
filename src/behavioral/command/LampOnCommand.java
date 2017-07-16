package behavioral.command;

public class LampOnCommand implements Command { // ������ �Ѵ� Ŭ����
	private Lamp theLamp;

	public LampOnCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	public void execute() {
		theLamp.turnOn();
	}
}