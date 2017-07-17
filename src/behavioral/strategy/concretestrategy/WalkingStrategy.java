package behavioral.strategy.concretestrategy;

import behavioral.strategy.strategy.MovingStrategy;

public class WalkingStrategy implements MovingStrategy {
	public void move() {
		System.out.println("Walking");
	}
}