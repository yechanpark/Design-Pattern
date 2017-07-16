package behavioral.command;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		setCommand(theCommand);
	}

	public void setCommand(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void pressed() { // 버튼이 눌리면 주어진 Command의 execute 메서드를 호출함
		theCommand.execute();
	}
}