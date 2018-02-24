package behavioral.state.state.concretestate;

import behavioral.state.context.Context;
import behavioral.state.state.State;

// Green State
public class ConcreteState3 implements State {

	// Singleton Pattern
	private static ConcreteState3 concreteState3 = new ConcreteState3();

	private ConcreteState3() {
	}

	public static ConcreteState3 getInstance() {
		return concreteState3;
	}

	public void on(Context context) {
		context.setState(ConcreteState4.getInstance());
		System.out.println("경고 : 노랑");
	}

	public void off(Context context) {
		context.setState(ConcreteState1.getInstance());
		System.out.println("초록에서 꺼짐");
	}
}