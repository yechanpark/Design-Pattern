package structural.decorator.decorator;

import structural.decorator.component.Display;

//�پ��� �߰� ��ɿ� ���� ���� Ŭ����
public abstract class DisplayDecorator extends Display {
	private Display decoratedDisplay;

	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	public void draw() {
		decoratedDisplay.draw();
	}
}