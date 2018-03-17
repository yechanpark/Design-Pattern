package behavioral.state.context;

import behavioral.state.state.concretestate.ConcreteState1;
import behavioral.state.state.State;

// Light
public class Context {
	private State state;

	public Context() {
		// 초기 값
		state = ConcreteState1.getInstance();
	}

	public void setState(State state) {
		this.state = state;
	}

	// Delegation
	public void on() {
		state.on(this);
	}

	// Delegation
	public void off() {
		state.off(this);
	}
}