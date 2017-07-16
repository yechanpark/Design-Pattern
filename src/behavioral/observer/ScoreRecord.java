package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
 
// 실질적으로 정보의 변경이 일어나는 클래스. -> 구체적인 변경 감시 대상 데이터
public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<Integer>();
 
    // 실질적인 정보의 변경
    public void addScore(int score) {
        scores.add(score);
 
        // 데이터가 변경되면 Subject 클래스의 notifyObservers 메서드를 호출해
        // 각 옵서버(통보 대상 클래스)에게 데이터의 변경을 통보함
        notifyObservers();
    }
 
    public List<Integer> getScoreRecord() {
        return scores;
    }
}