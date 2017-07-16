package behavioral.command;

public class LampOnCommand implements Command { // 램프를 켜는 클래스
	private Lamp theLamp;

	public LampOnCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	public void execute() {
		theLamp.turnOn();
	}
}