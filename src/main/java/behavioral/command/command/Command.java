package behavioral.command.command;

// 추상적인 개념의 명령
public interface Command {
	//executed by Invoker
	public void execute();
}