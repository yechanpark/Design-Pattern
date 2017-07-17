package behavioral.strategy.concretestrategy;

import behavioral.strategy.strategy.AttackStrategy;

public class MissileStrategy implements AttackStrategy {
	public void attack() {
		System.out.println("Missile");
	}
}