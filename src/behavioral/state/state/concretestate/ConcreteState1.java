package behavioral.state.state.concretestate;

import behavioral.state.context.Context;
import behavioral.state.state.State;

// OFF State
public class ConcreteState1 implements State {

	// Singleton Pattern
	private static ConcreteState1 concreteState1 = new ConcreteState1(); // OFF 클래스의 인스턴스로 초기화 됨

	private ConcreteState1() {
	}

	public static ConcreteState1 getInstance() { // 초기화된 OFF 클래스의 인스턴스를 반환함
		return concreteState1;
	}

	public void on(Context context) {
		context.setState(ConcreteState2.getInstance());
		System.out.println("Light ON");
	}

	public void off(Context context) {
		System.out.println("반응 없음(이미 꺼짐)");
	}
}