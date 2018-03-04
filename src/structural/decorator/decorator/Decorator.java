package structural.decorator.decorator;

import structural.decorator.component.Component;

//다양한 추가 기능에 대한 공통 클래스
public abstract class Decorator implements Component {
	// 지금까지 조합된 Component를 참조하는 레퍼런스
	private Component component;

	// 지금까지 조합된 Component를 DI받음
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void decoratorDo() {
		component.decoratorDo();
	}
}