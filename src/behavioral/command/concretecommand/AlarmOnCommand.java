package behavioral.command.concretecommand;

import behavioral.command.command.Command;
import behavioral.command.receiver.Alarm;

public class AlarmOnCommand implements Command { // 알람을 울리는 클래스
	private Alarm theAlarm;

	public AlarmOnCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void execute() {
		theAlarm.start();
	}
}