package structural.decorator.concretedecorator;

import structural.decorator.component.Component;
import structural.decorator.decorator.Decorator;

// 추가 기능 2
public class ConcreteDecorator2 extends Decorator {
	public ConcreteDecorator2(Component component) {
		super(component);
	}

	public void decoratorDo() {
		super.decoratorDo();
		concreteDecorator2Do();
	}

	private void concreteDecorator2Do() {
		System.out.println("\t" + this.getClass().getSimpleName() + "# Do()");
	}
}