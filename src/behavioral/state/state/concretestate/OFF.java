package behavioral.state.state.concretestate;

import behavioral.state.context.Light;
import behavioral.state.state.State;

// 싱글톤 패턴 적용
public class OFF implements State {
	private static OFF off = new OFF(); // OFF 클래스의 인스턴스로 초기화 됨

	private OFF() {
	}

	public static OFF getInstance() { // 초기화된 OFF 클래스의 인스턴스를 반환함
		return off;
	}

	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On");
	}

	public void off_button_pushed(Light light) {
		System.out.println("반응 없음");
	}
}