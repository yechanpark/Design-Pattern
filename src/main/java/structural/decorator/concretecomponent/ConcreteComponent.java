package structural.decorator.concretecomponent;

import structural.decorator.component.Component;

// 기본 기능
public class ConcreteComponent implements Component {
	public void decoratorDo() {
		System.out.println("\t" + this.getClass().getSimpleName() + "# Do()");
	}
}