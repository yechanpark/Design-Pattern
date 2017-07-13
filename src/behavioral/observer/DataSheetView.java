package behavioral.observer;

//implements를 제외한 나머지는 코드 9.1과 동일
import java.util.List;

//DataSheetView는 Observer의 기능, 즉 update 메서드를 구현함으로써 통보 대상이 됨
public class DataSheetView implements Observer{
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