package structural.composite.leaf;

import structural.composite.component.Component;

public class Leaf4 extends Component {
	private int value;

	public Leaf4(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}