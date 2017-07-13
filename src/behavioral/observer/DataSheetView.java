package behavioral.observer;

//implements�� ������ �������� �ڵ� 9.1�� ����
import java.util.List;

//DataSheetView�� Observer�� ���, �� update �޼��带 ���������ν� �뺸 ����� ��
public class DataSheetView implements Observer{
 private ScoreRecord scoreRecord;
 private int viewCount;

 public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
     this.scoreRecord = scoreRecord;
     this.viewCount = viewCount;
 }

 public void update() { // ������ ������ �뺸 ����
     List<Integer> record = scoreRecord.getScoreRecord(); // ������ ��ȸ
     displayScores(record, viewCount); // ��ȸ�� ������ viewCount ��ŭ�� �����
 }

 private void displayScores(List<Integer> record, int viewCount) {
     System.out.println("List of " + viewCount + "entries: ");
     for (int i = 0; i < viewCount && i < record.size(); i++)
         System.out.print(record.get(i) + " ");
     System.out.println();
 }
}