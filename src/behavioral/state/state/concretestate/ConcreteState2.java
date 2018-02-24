package behavioral.state.state.concretestate;

import behavioral.state.context.Context;
import behavioral.state.state.State;

// ON State
public class ConcreteState2 implements State {

	// Singleton Pattern
	private static ConcreteState2 concreteState2 = new ConcreteState2(); // ON 클래스의 인스턴스로 초기화 됨\

	private ConcreteState2() {
	}

	public static ConcreteState2 getInstance() { // 초기화된 ON 클래스의 인스턴스를 반환함
		return concreteState2;
	}

	public void on(Context context) {
		context.setState(ConcreteState3.getInstance());
		System.out.println("경고 : 초록");
	}

	public void off(Context context) {
		context.setState(ConcreteState1.getInstance());
		System.out.println("Light OFF");
	}
}