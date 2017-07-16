package structural.decorator;

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