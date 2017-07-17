package behavioral.strategy;

import behavioral.strategy.concretestrategy.FlyingStrategy;
import behavioral.strategy.concretestrategy.MissileStrategy;
import behavioral.strategy.concretestrategy.PunchStrategy;
import behavioral.strategy.concretestrategy.WalkingStrategy;
import behavioral.strategy.context.Atom;
import behavioral.strategy.context.Robot;
import behavioral.strategy.context.TaekwonV;

public class Client {
	public static void main(String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");

		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());

		atom.setMovingStrategy(new FlyingStrategy()); // 이동 전략을 날아간다는 전략으로 설정
		atom.setAttackStrategy(new PunchStrategy()); // 공격 전략을 펀치 전략으로 설정

		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println();

		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
