package behavioral.observer.concreteobserver;

import java.util.Collections;
import java.util.List;

import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;

// MinMaxChart
public class ConcreteObserver1 implements Observer {
	private ConcreteSubject concreteSubject;

	public ConcreteObserver1(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
	}

	public void update() { // 정보의 변경을 통보받음
		List<Integer> numberList = concreteSubject.getNumbers(); // 변경된 데이터를 가져옴
		showMinMAx(numberList); // 최소, 최대값 출력
	}

	private void showMinMAx(List<Integer> numberList) {
		System.out.println("min : " + Collections.min(numberList));
		System.out.println("max : " + Collections.max(numberList));
	}
}