package behavioral.state.state.concretestate;

import behavioral.state.context.Context;
import behavioral.state.state.State;

// Yellow State
public class ConcreteState4 implements State {

	// Singleton Pattern
	private static ConcreteState4 concreteState4 = new ConcreteState4();

	private ConcreteState4() {
	}

	public static ConcreteState4 getInstance() {
		return concreteState4;
	}

	public void on(Context context) {
		context.setState(ConcreteState5.getInstance());
		System.out.println("경고 : 빨강");
	}

	public void off(Context context) {
		context.setState(ConcreteState1.getInstance());
		System.out.println("노랑에서 꺼짐");
	}
}