package behavioral.state.context;

import behavioral.state.concretestate.OFF;
import behavioral.state.state.State;

// Context Class
public class Light {
	private State state;

	public Light() {
		state = OFF.getInstance();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void on_button_pushed() {
		state.on_button_pushed(this);
	}

	public void off_button_pushed() {
		state.off_button_pushed(this);
	}
}