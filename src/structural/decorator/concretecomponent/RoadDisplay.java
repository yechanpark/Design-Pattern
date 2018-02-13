package structural.decorator.concretecomponent;

import structural.decorator.component.Display;

public class RoadDisplay extends Display { // 기본 도로 표시 클래스
	public void draw() {
		System.out.println("기본 도로 표시");
	}
}