package behavioral.command;

import behavioral.command.command.Command;
import behavioral.command.concretecommand.ConcreteCommand1;
import behavioral.command.concretecommand.ConcreteCommand2;
import behavioral.command.concretecommand.ConcreteCommand3;
import behavioral.command.invoker.Invoker;
import behavioral.command.receiver.Receiver1;
import behavioral.command.receiver.Receiver2;

public class Client {
	public static void main(String[] args) {

		// Invoker(Button) 정의
		Invoker invoker = new Invoker();

		// 실질적으로 작업을 하는 개체 정의
		Receiver1 receiver1 = new Receiver1();
		Receiver2 receiver2 = new Receiver2();

		// 추상적인 객체(Command)로 수행시킬 구체적인 명령(ConcreteCommand1~3)을 캡슐화하여 정의
		Command command1 = new ConcreteCommand1(receiver1); // 명령1
		Command command2 = new ConcreteCommand2(receiver2); // 명령2
		Command command3 = new ConcreteCommand3(receiver1); // 명령3

		invoker.setCommand(command1);
		invoker.pressed(); // 첫 번째 클릭 - 명령 1 - TV ON

		invoker.setCommand(command2);
		invoker.pressed(); // 두 번째 클릭 - 명령 2 - Channel UP

		invoker.setCommand(command3);
		invoker.pressed(); // 세 번째 클릭 - 명령 3 - TV OFF
	}
}