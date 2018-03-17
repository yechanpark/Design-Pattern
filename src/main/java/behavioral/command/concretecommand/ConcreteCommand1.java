package behavioral.command.concretecommand;

import behavioral.command.command.Command;
import behavioral.command.receiver.Receiver1;

// Receiver1을 통해 특정 기능(turnOn()) 1개만 수행하는 ConcreteCommand
public class ConcreteCommand1 implements Command {
	private Receiver1 receiver1;

	// Dependency Injected by Client
	public ConcreteCommand1(Receiver1 receiver1) {
		this.receiver1 = receiver1;
	}

	public void execute() {
		receiver1.turnOn(); // Delegation
	}
}