package behavioral.strategy;

import behavioral.strategy.strategy.concretestrategy.ConcreteStrategy2_1;
import behavioral.strategy.strategy.concretestrategy.ConcreteStrategy1_1;
import behavioral.strategy.strategy.concretestrategy.ConcreteStrategy1_2;
import behavioral.strategy.strategy.concretestrategy.ConcreteStrategy2_2;
import behavioral.strategy.context.concretecontext.ConcreteContext2;
import behavioral.strategy.context.Context;
import behavioral.strategy.context.concretecontext.ConcreteContext1;

public class Client {
	public static void main(String[] args) {
		Context context1 = new ConcreteContext1("ConcreteContext1");
		Context context2 = new ConcreteContext2("ConcreteContext2");

		context1.setStrategy1(new ConcreteStrategy1_1());
		context1.setStrategy2(new ConcreteStrategy2_2());

		context2.setStrategy1(new ConcreteStrategy1_2());
		context2.setStrategy2(new ConcreteStrategy2_1());

		System.out.println("ConcreteContext1's name is " + context1.getName());
		context1.move();
		context1.attack();

		System.out.println();

		System.out.println("ConcreteContext2's name is " + context2.getName());
		context2.move();
		context2.attack();
	}
}
