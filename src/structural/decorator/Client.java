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
				road = new LaneDecorator(road); // ���� ǥ�� ����� �������� �߰�
			if (decoratorName.equalsIgnoreCase("Traffic"))
				road = new TrafficDecorator(road); // ���뷮 ǥ�� ����� �������� �߰�
			if (decoratorName.equalsIgnoreCase("Crossing"))
				road = new CrossingDecorator(road); // ������ ǥ�� ����� �������� �߰�
		}

		road.draw();
	}
}