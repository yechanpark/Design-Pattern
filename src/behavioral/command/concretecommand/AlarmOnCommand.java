package behavioral.command.concretecommand;

import behavioral.command.command.Command;
import behavioral.command.receiver.Alarm;

public class AlarmOnCommand implements Command { // �˶��� �︮�� Ŭ����
	private Alarm theAlarm;

	public AlarmOnCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void execute() {
		theAlarm.start();
	}
}