package behavioral.state.concretestate;

import behavioral.state.context.Light;
import behavioral.state.state.State;

// 싱글톤 패턴 적용
public class ON implements State {
	private static ON on = new ON(); // ON 클래스의 인스턴스로 초기화 됨

	private ON() {
	}

	public static ON getInstance() { // 초기화된 ON 클래스의 인스턴스를 반환함
		return on;
	}

	public void on_button_pushed(Light light) {
		System.out.println("반응 없음");
	}

	public void off_button_pushed(Light light) {
		light.setState(OFF.getInstance());
		System.out.println("Light Off");
	}
}