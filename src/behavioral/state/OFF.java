package behavioral.state;

// �̱��� ���� ����
public class OFF implements State {
	private static OFF off = new OFF(); // OFF Ŭ������ �ν��Ͻ��� �ʱ�ȭ ��

	private OFF() {
	}

	public static OFF getInstance() { // �ʱ�ȭ�� OFF Ŭ������ �ν��Ͻ��� ��ȯ��
		return off;
	}

	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On");
	}

	public void off_button_pushed(Light light) {
		System.out.println("���� ����");
	}
}