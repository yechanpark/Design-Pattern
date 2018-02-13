package behavioral.command.invoker;

import behavioral.command.command.Command;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		setCommand(theCommand);
	}

	public void setCommand(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void pressed() { // ��ư�� ������ �־��� Command�� execute �޼��带 ȣ����
		theCommand.execute();
	}
}