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

		atom.setMovingStrategy(new FlyingStrategy()); // �̵� ������ ���ư��ٴ� �������� ����
		atom.setAttackStrategy(new PunchStrategy()); // ���� ������ ��ġ �������� ����

		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println();

		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
