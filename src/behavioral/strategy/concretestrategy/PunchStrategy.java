package behavioral.strategy.concretestrategy;

import behavioral.strategy.strategy.AttackStrategy;

public class PunchStrategy implements AttackStrategy {
	public void attack() {
		System.out.println("Punch");
	}
}