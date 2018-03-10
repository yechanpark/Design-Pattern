package structural.composite.leaf;

import structural.composite.component.Component;

public class Leaf2 extends Component {
	private int value;

	public Leaf2(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}