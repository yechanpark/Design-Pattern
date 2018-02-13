package structural.composite;

import structural.composite.composite.Computer;
import structural.composite.leaf.Body;
import structural.composite.leaf.Keyboard;
import structural.composite.leaf.Monitor;
import structural.composite.leaf.Speaker;

public class Client {
	public static void main(String[] args) {
		// 컴퓨터의 부품으로 Body, Keyboard, Monitor, Speaker 객체를 생성함
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Monitor monitor = new Monitor(20, 30);
		Speaker speaker = new Speaker(10, 10);

		// Computer 객체를 생성하고 부품 객체들을 설정함
		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);

		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		System.out.println("Power : " + computerPower + "W");
		System.out.println("Price : " + computerPrice + "만 원");
	}
}