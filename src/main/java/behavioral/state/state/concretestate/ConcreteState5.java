package behavioral.state.state.concretestate;

import behavioral.state.context.Context;
import behavioral.state.state.State;

// Red State
public class ConcreteState5 implements State {

	// Singleton Pattern
	private static ConcreteState5 concreteState5 = new ConcreteState5();

	private ConcreteState5() {
	}

	public static ConcreteState5 getInstance() {
		return concreteState5;
	}

	public void on(Context context) {
		context.setState(ConcreteState1.getInstance());
		System.out.println("과부하로 인해 꺼짐");
	}

	public void off(Context context) {
		context.setState(ConcreteState1.getInstance());
		System.out.println("빨강에서 꺼짐");
	}
}