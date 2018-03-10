package structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import structural.composite.component.Component;

// 추상적인 구성요소 Component들로 구성된 구성체
public class Composite extends Component {

	// Composite는 복수 개의 Component 객체들로 구성됨
	private List<Component> components = new ArrayList<Component>();

	// Component 객체를 Composite 클래스에 추가
	public void addComponent(Component component) {
		components.add(component);
	}

	// Component 객체를 Composite 클래스에서 제거
	public void removeComponent(Component component) {
		components.remove(component);
	}

	// 저장된 모든 Component의 value 총합
	@Override
	public int getValue() {
		int sumValue = 0;

		for (Component component : components)
			sumValue += component.getValue();

		return sumValue;
	}

}