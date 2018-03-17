package behavioral.strategy.context;

import behavioral.strategy.strategy.Strategy1;
import behavioral.strategy.strategy.Strategy2;

// 추상 Context
public abstract class Context {
	private String name;
	private Strategy1 strategy1;
	private Strategy2 strategy2;

	public Context(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void move() {
		strategy2.move();
	}

	public void attack() {
		strategy1.attack();
	}

	public void setStrategy2(Strategy2 strategy2) {
		this.strategy2 = strategy2;
	}

	public void setStrategy1(Strategy1 strategy1) {
		this.strategy1 = strategy1;
	}
}
