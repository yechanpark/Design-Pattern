package structural.decorator.concretedecorator;

import structural.decorator.component.Display;
import structural.decorator.decorator.DisplayDecorator;

public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay); // 부모 클래스의 생성자를 호출
	}

	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("\t교통량 표시");
	}
}