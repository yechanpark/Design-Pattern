package structural.decorator;

import structural.decorator.component.Display;
import structural.decorator.concretecomponent.RoadDisplay;
import structural.decorator.concretedecorator.CrossingDecorator;
import structural.decorator.concretedecorator.LaneDecorator;
import structural.decorator.concretedecorator.TrafficDecorator;

public class Client {
	public static void main(String[] args) {
		Display road = new RoadDisplay();

		for (String decoratorName : args) {
			if (decoratorName.equalsIgnoreCase("Lane"))
				road = new LaneDecorator(road); // 차선 표시 기능을 동적으로 추가
			if (decoratorName.equalsIgnoreCase("Traffic"))
				road = new TrafficDecorator(road); // 교통량 표시 기능을 동적으로 추가
			if (decoratorName.equalsIgnoreCase("Crossing"))
				road = new CrossingDecorator(road); // 교차로 표시 기능을 동적으로 추가
		}

		road.draw();
	}
}