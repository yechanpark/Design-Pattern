package creational.abstractfactory.abstractfactory;

import creational.abstractfactory.abstractproduct.AbstractProduct1;
import creational.abstractfactory.abstractproduct.AbstractProduct2;

public abstract class AbstractFactory { // 추상 부품을 생성하는 추상 팩토리
	public abstract AbstractProduct1 createAbstractProduct1();
	public abstract AbstractProduct2 createAbstractProduct2();
}