package behavioral.state.concretestate;

import behavioral.state.context.Light;
import behavioral.state.state.State;

// �̱��� ���� ����
public class ON implements State {
	private static ON on = new ON(); // ON Ŭ������ �ν��Ͻ��� �ʱ�ȭ ��

	private ON() {
	}

	public static ON getInstance() { // �ʱ�ȭ�� ON Ŭ������ �ν��Ͻ��� ��ȯ��
		return on;
	}

	public void on_button_pushed(Light light) {
		System.out.println("���� ����");
	}

	public void off_button_pushed(Light light) {
		light.setState(OFF.getInstance());
		System.out.println("Light Off");
	}
}