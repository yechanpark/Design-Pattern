package behavioral.command;

public class AlarmOnCommand implements Command { // �˶��� �︮�� Ŭ����
	private Alarm theAlarm;

	public AlarmOnCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void execute() {
		theAlarm.start();
	}
}