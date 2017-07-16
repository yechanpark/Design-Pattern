package behavioral.observer;

import java.util.Collections;
import java.util.List;

//MinMaxView�� �ּ� �ִ� ������ ������
public class MinMaxView implements Observer {
	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() { // ������ ������ �뺸����
		List<Integer> record = scoreRecord.getScoreRecord(); // ������ ��ȸ��
		displayMinMax(record); // �ּ� ���� �ִ� ���� ���
	}

	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min :" + min + "Max :" + max);
	}
}
