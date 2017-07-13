package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        scoreRecord.attach(dataSheetView3);
        MinMaxView minMaxView = new MinMaxView(scoreRecord); // MinMaxView ����
        scoreRecord.attach(minMaxView);
        
        // 3�� ��� DataSheetView, 5�� ��� DataSheetView, �׸��� MinMaxView�� Observer�� ������
        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            // �� ���� �߰� �� �ִ� 3�� ���, 5�� ���, �ּ�/�ִ� ���� �����
            scoreRecord.addScore(score);
        }
        
        scoreRecord.detach(dataSheetView3); // 3�� ��� DataSheetView�� ���� Observer�� �ƴ�
        StatisticsView statisticsView = new StatisticsView(scoreRecord);
        scoreRecord.attach(statisticsView); // StatisticsView�� Observer�μ� ������
        
        // ���� 5�� ��� DataSheetView, MinMaxView, �׸��� StatisticsView�� Observer��
        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            // �� ���� �߰� �� �ִ� 5�� ���, �ּ�/�ִ� ��, ��/����� �����
            scoreRecord.addScore(score);
        }
    }
}

