package behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.observer.Observer;

// 추상화된 Observer들을 관리하는 클래스
public abstract class Subject {

	// 추상화된 통보 대상(Observers) 목록
	private List<Observer> observers = new ArrayList<Observer>();

	// 옵서버(통보 대상) 추가
	public void attach(Observer observer) {
		observers.add(observer);
	}

	// 옵서버(통보 대상) 삭제
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	// 등록된 observers(통보 대상들)에게 정보의 변경을 통보
	public void notifyObservers() {
		for (Observer o : observers)
			o.update();
	}
}