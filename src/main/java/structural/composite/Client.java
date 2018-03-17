package structural.composite;

import structural.composite.composite.Composite;
import structural.composite.leaf.Leaf1;
import structural.composite.leaf.Leaf2;
import structural.composite.leaf.Leaf3;
import structural.composite.leaf.Leaf4;

public class Client {
	public static void main(String[] args) {
		// Composite의 구성될 요소가 될 객체들을 생성
		Leaf1 leaf1 = new Leaf1(10);
		Leaf2 leaf2 = new Leaf2(20);
		Leaf3 leaf3 = new Leaf3(30);
		Leaf4 leaf4 = new Leaf4(40);

		// Composite 객체를 생성하고 이를 구성할 객체들을 설정
		Composite composite = new Composite();
		composite.addComponent(leaf1);
		composite.addComponent(leaf2);
		composite.addComponent(leaf3);
		composite.addComponent(leaf4);

		int sumValue = composite.getValue();
		System.out.println(sumValue);
	}
}