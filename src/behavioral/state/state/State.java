package behavioral.state.state;

import behavioral.state.context.Light;

// ���¸� �߻�ȭ
public interface State {
	public void on_button_pushed(Light light);

	public void off_button_pushed(Light light);
}