package behavioral.observer.naive;

import java.util.Collections;
import java.util.List;

public class MinMaxChart {
    // DB로부터 값을 전달받기 위해 레퍼런스 존재
    NumberDataBase numberDataBase;

    public void setNumberDataBase(NumberDataBase numberDataBase) {
        this.numberDataBase = numberDataBase;
    }

    public void update() {
        List<Integer> numberList = numberDataBase.select();
        show(numberList);
    }

    public void show(List<Integer> numberList) {
        System.out.println("min : " + Collections.min(numberList));
        System.out.println("max : " + Collections.max(numberList));
    }
}

