package behavioral.observer.concreteobserver;

import java.util.Collections;
import java.util.List;

import behavioral.observer.concretesubject.ScoreRecord;
import behavioral.observer.observer.Observer;

//MinMaxView는 최소 최대 점수를 보여줌
public class MinMaxView implements Observer {
	private ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() { // 점수의 변경을 통보받음
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회함
		displayMinMax(record); // 최소 값과 최대 값을 출력
	}

	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min :" + min + "Max :" + max);
	}
}
