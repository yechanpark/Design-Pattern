package behavioral.command.receiver;

// PowerModule, 실질적으로 작업을 수행할 개체
public class Receiver1 {
	// executed by ConcreteCommand1
	public void turnOn() {
		System.out.println("TV On");
	}

	// executed by ConcreteCommand3
	public void turnOff() {
		System.out.println("TV Off");
	}

}