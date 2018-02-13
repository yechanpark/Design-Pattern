package behavioral.observer.concreteobserver;

import java.util.List;

import behavioral.observer.concretesubject.ScoreRecord;
import behavioral.observer.observer.Observer;

// 성적을 목록으로 보여주는 클래스
public class DataSheetView implements Observer {
	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	public void update() { // 점수의 변경을 통보 받음
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회
		displayScores(record, viewCount); // 조회된 점수를 viewCount 만큼만 출력함
	}

	private void displayScores(List<Integer> record, int viewCount) {
		System.out.println("List of " + viewCount + "entries: ");
		for (int i = 0; i < viewCount && i < record.size(); i++)
			System.out.print(record.get(i) + " ");
		System.out.println();
	}
}