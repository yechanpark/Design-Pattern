package behavioral.observer.concreteobserver;

import java.util.Collections;
import java.util.List;

import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;

// AscChart
public class ConcreteObserver2 implements Observer {
	private ConcreteSubject concreteSubject;

	public ConcreteObserver2(ConcreteSubject concreteSubject) {
		this.concreteSubject = concreteSubject;
	}

	public void update() { // 정보의 변경을 통보받음
		List<Integer> numberList = concreteSubject.getNumbers(); // 변경된 데이터를 가져옴
		showAsc(numberList); // 오름차순 출력
	}

	private void showAsc(List<Integer> numberList) {
		Collections.sort(numberList);

		System.out.print("ASC :  ");

		for(Integer number : numberList)
			System.out.print(number + " ");

		System.out.println();

	}
}
