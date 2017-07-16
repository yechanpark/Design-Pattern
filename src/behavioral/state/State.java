package behavioral.state;

// 상태를 추상화
public interface State {
	public void on_button_pushed(Light light);

	public void off_button_pushed(Light light);
}