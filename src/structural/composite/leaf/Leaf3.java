package structural.composite.leaf;

import structural.composite.component.Component;

public class Leaf3 extends Component {
	private int value;

	public Leaf3(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
