package behavioral.command;

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