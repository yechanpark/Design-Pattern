package creational.abstractfactory.abstractproduct;

public abstract class AbstractProduct2 {

	// Template Method
	public void do3() {
		do3Primitive();
	}

	// Primitive Method 또는 Hook Method
	protected abstract void do3Primitive();
}