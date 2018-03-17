package behavioral.observer;

import behavioral.observer.concreteobserver.ConcreteObserver1;
import behavioral.observer.concreteobserver.ConcreteObserver2;
import behavioral.observer.concreteobserver.ConcreteObserver3;
import behavioral.observer.concretesubject.ConcreteSubject;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		ConcreteObserver1 concreteObserver1 = new ConcreteObserver1(concreteSubject); // MinMax
		ConcreteObserver2 concreteObserver2 = new ConcreteObserver2(concreteSubject); // ASC
		ConcreteObserver3 concreteObserver3 = new ConcreteObserver3(concreteSubject); // DESC

		concreteSubject.attach(concreteObserver1); // Observer 추가
		concreteSubject.attach(concreteObserver2); // Observer 추가

		// 자료가 입력될 때 마다 MinMax, ASC가 출력됨
		System.out.println("-----------------");
		for (int index = 1; index <= 5; index++) {
			int number = index * 10;
			System.out.println("Add : " + number);
			// 숫자가 추가될 때 마다 MinMax, ASC 출력
			concreteSubject.addNumber(number);
			System.out.println("-----------------");
		}


		// MinMax를 Observer에서 제외, 더 이상 출력되지 않음
		concreteSubject.detach(concreteObserver1);
		// DESC를 Observer에 추가, 값이 변경될 때 마다 통보받아 출력함
		concreteSubject.attach(concreteObserver3);


		// 자료가 입력될 때 마다 ASC, DESC가 출력됨
		System.out.println("-----------------");
		for (int index = 1; index <= 5; index++) {
			int number = index * 10;

			System.out.println("Adding " + number);
			concreteSubject.addNumber(number);
			System.out.println("-----------------");
		}
	}
}
