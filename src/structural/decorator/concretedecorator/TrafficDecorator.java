package structural.decorator.concretedecorator;

import structural.decorator.component.Display;
import structural.decorator.decorator.DisplayDecorator;

public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay); // �θ� Ŭ������ �����ڸ� ȣ��
	}

	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("\t���뷮 ǥ��");
	}
}