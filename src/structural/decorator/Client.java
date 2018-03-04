package structural.decorator;

import structural.decorator.component.Component;
import structural.decorator.concretecomponent.ConcreteComponent;
import structural.decorator.concretedecorator.ConcreteDecorator1;
import structural.decorator.concretedecorator.ConcreteDecorator2;
import structural.decorator.concretedecorator.ConcreteDecorator3;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();

		System.out.println("- 기본 -");
		component.decoratorDo();

		System.out.println("- 기본 -> 추가기능1 -");
		component = new ConcreteDecorator1(component);
		component.decoratorDo();

		System.out.println("- 기본 -> 추가기능1 - 2");
		component = new ConcreteDecorator2(component);
		component.decoratorDo();

		System.out.println("- 기본 -> 추가기능1 -> 2 -> 3 -");
		component = new ConcreteDecorator3(component);
		component.decoratorDo();

		Component component2 = new ConcreteComponent();
		System.out.println("- 기본 -> 추가기능2 -> 3 -> 1 -");
		component2 = new ConcreteDecorator1(new ConcreteDecorator3(new ConcreteDecorator2(component2)));
		component2.decoratorDo();

	}
}