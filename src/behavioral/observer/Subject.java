package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
 
public abstract class Subject { // �߻�ȭ�� ���� ���� ��� ������
    // �߻�ȭ�� �뺸 ��� ���
    private List<Observer> observers = new ArrayList<Observer>();
 
    public void attach(Observer observer) { // �ɼ���, �� �뺸 ����� �߰���
        observers.add(observer);
    }
 
    public void detach(Observer observer) { // �ɼ���, �� �뺸 ����� ������
        observers.remove(observer);
    }
 
    // �뺸 ��� ���, �� ��ϵ� observers�� �� �ɼ������� ������ �뺸��
    public void notifyObservers() {
        for (Observer o : observers)
            o.update();
    }
}