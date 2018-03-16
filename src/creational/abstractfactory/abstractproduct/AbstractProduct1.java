package creational.abstractfactory.abstractproduct;

public abstract class AbstractProduct1 {

	// Template Method
	public void do1() {
		do1Primitive();
	}

	// Template Method
	public void do2() {
		do2Primitive();
	}

	// Primitive Method 또는 Hook Method
	protected abstract void do1Primitive();
	protected abstract void do2Primitive();
}