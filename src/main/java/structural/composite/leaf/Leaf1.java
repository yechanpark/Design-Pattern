package structural.composite.leaf;

import structural.composite.component.Component;

public class Leaf1 extends Component {
	private int value;

	public Leaf1(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}