package behavioral.templatemethod.abstractclass;

public abstract class AbstractClass {

	public void templateMethod() {

		logic1();
		// Primitive Method -> 하위 클래스에서 각각 구현
		// 이 메서드는 ConcreteClass1, 2에서 특수화(오버라이드) 됨
		primitiveMethod();
		logic2();
		logic3();
	}

	// Primitive Method ( or Hook Method )
	protected abstract void primitiveMethod();

	private void logic1() {
		System.out.println("logic1()");
	}

	private void logic2() {
		System.out.println("logic2()");
	}

	private void logic3() {
		System.out.println("logic3()");
	}
}