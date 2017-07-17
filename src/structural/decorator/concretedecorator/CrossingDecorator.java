package structural.decorator.concretedecorator;

import structural.decorator.component.Display;
import structural.decorator.decorator.DisplayDecorator;

public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw();
		drawCrossing();
	}

	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}
}