package creational.abstractfactory.concretefactory;

import creational.abstractfactory.abstractfactory.AbstractFactory;
import creational.abstractfactory.abstractproduct.AbstractProduct1;
import creational.abstractfactory.abstractproduct.AbstractProduct2;
import creational.abstractfactory.concreteproduct.BConcreteProduct1;
import creational.abstractfactory.concreteproduct.BConcreteProduct2;

// 싱글턴 패턴을 적용한 BConcreteFactory.
// B사에 대한 구체적인 부품들을 생산한다.
public class BConcreteFactory extends AbstractFactory {

	private static AbstractFactory factory;

	private BConcreteFactory() {
	}

	public static AbstractFactory getInstance() {
		if (factory == null)
			factory = new BConcreteFactory();
		return factory;
	}

	// B사의 구체적 부품1 생산
	@Override
	public AbstractProduct1 createAbstractProduct1() {
		return new BConcreteProduct1();
	}

	// B사의 구체적 부품2 생산
	@Override
	public AbstractProduct2 createAbstractProduct2() {
		return new BConcreteProduct2();
	}

}
