package behavioral.command.concretecommand;

import behavioral.command.command.Command;
import behavioral.command.receiver.Lamp;

public class LampOnCommand implements Command { // ������ �Ѵ� Ŭ����
	private Lamp theLamp;

	public LampOnCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	public void execute() {
		theLamp.turnOn();
	}
}