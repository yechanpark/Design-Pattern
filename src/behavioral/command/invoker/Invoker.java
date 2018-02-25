package behavioral.command.invoker;

import behavioral.command.command.Command;

// Button
public class Invoker {
	private Command command;

	// Dependency Injected by Client
	public void setCommand(Command command) {
		this.command = command;
	}

	// executed by Client
	public void pressed() {
		command.execute(); // Delegation
	}
}