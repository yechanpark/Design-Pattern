package behavioral.observer.concretesubject;

import java.util.ArrayList;
import java.util.List;

import behavioral.observer.subject.Subject;
 
// ���������� ������ ������ �Ͼ�� Ŭ����. -> ��ü���� ���� ���� ��� ������
public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<Integer>();
 
    // �������� ������ ����
    public void addScore(int score) {
        scores.add(score);
 
        // �����Ͱ� ����Ǹ� Subject Ŭ������ notifyObservers �޼��带 ȣ����
        // �� �ɼ���(�뺸 ��� Ŭ����)���� �������� ������ �뺸��
        notifyObservers();
    }
 
    public List<Integer> getScoreRecord() {
        return scores;
    }
}