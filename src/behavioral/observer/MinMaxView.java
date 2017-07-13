package behavioral.observer;

//implements�� ������ �������� �ڵ� 9.2�� ����
import java.util.Collections;
import java.util.List;

//MinMaxView�� Observer�� ���, �� update �޼��带 ���������ν� �뺸 ����� ��
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

