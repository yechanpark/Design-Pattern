package creational.abstractfactory.concretefactory;

import creational.abstractfactory.abstractfactory.AbstractFactory;
import creational.abstractfactory.abstractproduct.AbstractProduct1;
import creational.abstractfactory.abstractproduct.AbstractProduct2;
import creational.abstractfactory.concreteproduct.AConcreteProduct1;
import creational.abstractfactory.concreteproduct.AConcreteProduct2;

// 싱글턴 패턴을 적용한 AConcreteFactory.
// A사에 대한 구체적인 부품들을 생산한다.
public class AConcreteFactory extends AbstractFactory {

	private static AbstractFactory factory;

	private AConcreteFactory() {
	}

	public static AbstractFactory getInstance() {
		if (factory == null)
			factory = new AConcreteFactory();
		return factory;
	}

	// A사의 구체적 부품1 생산
	@Override
	public AbstractProduct1 createAbstractProduct1() {
		return new AConcreteProduct1();
	}

	// A사의 구체적 부품2 생산
	@Override
	public AbstractProduct2 createAbstractProduct2() {
		return new AConcreteProduct2();
	}

}