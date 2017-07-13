package behavioral.observer;

//implements를 제외한 나머지는 코드 9.2와 동일
import java.util.Collections;
import java.util.List;

//MinMaxView는 Observer의 기능, 즉 update 메서드를 구현함으로써 통보 대상이 됨
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

