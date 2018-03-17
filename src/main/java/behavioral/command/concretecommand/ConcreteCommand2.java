package behavioral.command.concretecommand;

import behavioral.command.command.Command;
import behavioral.command.receiver.Receiver2;

// Receiver2를 통해 특정 기능(channelUp()) 1개만 수행하는 ConcreteCommand
public class ConcreteCommand2 implements Command {
    private Receiver2 receiver2;

	// Dependency Injected by Client
    public ConcreteCommand2(Receiver2 receiver2) {
		this.receiver2 = receiver2;
	}

    public void execute() {
		receiver2.channelUp(); // Delegation
	}
}