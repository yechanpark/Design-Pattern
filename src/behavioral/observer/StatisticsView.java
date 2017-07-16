package behavioral.observer;

import java.util.List;

// 점수의 합과 평균을 출력
public class StatisticsView implements Observer {
    private ScoreRecord scoreRecord;
 
    public StatisticsView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }
 
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayStatistics(record); // 변경 통보 시 조회된 점수의 합과 평균을 출력
    }
 
    private void displayStatistics(List<Integer> record) {
        int sum = 0;
        for (int score : record)
            sum += score;
        float average = (float) sum / record.size();
        System.out.println("Sum :" + sum + " Average : " + average);
    }
}

