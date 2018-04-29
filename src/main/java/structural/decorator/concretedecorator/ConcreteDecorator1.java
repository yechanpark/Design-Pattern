package structural.decorator.concretedecorator;

import structural.decorator.component.Component;
import structural.decorator.decorator.Decorator;

// 추가 기능 1
public class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	public void decoratorDo() {
		super.decoratorDo();
		concreteDecorator1Do();
	}

	private void concreteDecorator1Do() {
		System.out.println("\t" + this.getClass().getSimpleName() + "# Do()");
	}
}