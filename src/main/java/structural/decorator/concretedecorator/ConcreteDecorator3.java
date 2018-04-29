package structural.decorator.concretedecorator;

import structural.decorator.component.Component;
import structural.decorator.decorator.Decorator;

// 추가 기능 3
public class ConcreteDecorator3 extends Decorator {
	public ConcreteDecorator3(Component component) {
		super(component);
	}

	public void decoratorDo() {
		super.decoratorDo();
		concreteDecorator3Do();
	}

	private void concreteDecorator3Do() {
		System.out.println("\t" + this.getClass().getSimpleName() + "# Do()");
	}
}