package behavioral.observer.naive;

import java.util.ArrayList;
import java.util.List;

public class NumberDataBase {
    private List<Integer> numberList;

    // DB에 값이 입력될 때 마다 Chart를 갱신시키기 위해 레퍼런스 존재
    private MinMaxChart minMaxChart;

    public NumberDataBase(MinMaxChart minMaxChart){
        numberList = new ArrayList<Integer>();
        this.minMaxChart = minMaxChart;
    }

    public void insertNumber(int number) {
        numberList.add(number);

        // 값이 들어올 때 마다 차트를 출력
        this.minMaxChart.update();
    }

    public List<Integer> select() {
        return numberList;
    }
}
