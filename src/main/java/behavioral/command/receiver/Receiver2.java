package behavioral.command.receiver;

// ChannelModule, 실질적으로 작업을 수행할 개체
public class Receiver2 {
	// executed by ConcreteCommand2
	public void channelUp() {
		System.out.println("Channel Up");
	}
}