package behavioral.observer;

import java.util.List;

// ������ �հ� ����� ���
public class StatisticsView implements Observer {
    private ScoreRecord scoreRecord;
 
    public StatisticsView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }
 
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayStatistics(record); // ���� �뺸 �� ��ȸ�� ������ �հ� ����� ���
    }
 
    private void displayStatistics(List<Integer> record) {
        int sum = 0;
        for (int score : record)
            sum += score;
        float average = (float) sum / record.size();
        System.out.println("Sum :" + sum + " Average : " + average);
    }
}

