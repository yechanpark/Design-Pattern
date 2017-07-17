package behavioral.observer.subject;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.observer.Observer;

// �߻�ȭ�� Observer���� �����ϴ� Ŭ����
public abstract class Subject {

	// �߻�ȭ�� �뺸 ���(Observers) ���
	private List<Observer> observers = new ArrayList<Observer>();

	// �ɼ���(�뺸 ���) �߰�
	public void attach(Observer observer) {
		observers.add(observer);
	}

	// �ɼ���(�뺸 ���) ����
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	// ��ϵ� observers(�뺸 ����)���� ������ ������ �뺸
	public void notifyObservers() {
		for (Observer o : observers)
			o.update();
	}
}