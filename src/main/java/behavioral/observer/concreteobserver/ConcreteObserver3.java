package behavioral.observer.concreteobserver;

import java.util.Collections;
import java.util.List;

import behavioral.observer.concretesubject.ConcreteSubject;
import behavioral.observer.observer.Observer;

// DescChart
public class ConcreteObserver3 implements Observer {
    private ConcreteSubject concreteSubject;
 
    public ConcreteObserver3(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
 
    public void update() { // 정보의 변경을 통보받음
        List<Integer> numberList = concreteSubject.getNumbers(); // 변경된 데이터를 가져옴
        showDesc(numberList); // 내림차순 출력
    }
 
    private void showDesc(List<Integer> numberList) {
        Collections.reverse(numberList);

        System.out.print("DESC :  ");

        for(Integer number : numberList)
            System.out.print(number + " ");

        System.out.println();
    }
}

