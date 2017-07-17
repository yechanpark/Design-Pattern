package behavioral.strategy.concretestrategy;

import behavioral.strategy.strategy.MovingStrategy;

public class FlyingStrategy implements MovingStrategy {
	public void move() {
		System.out.println("Flying");
	}
}