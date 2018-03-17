package behavioral.observer.observer;

public interface Observer { // 추상화된, 정보의 변경을 통보 받는 대상
    public void update(); // 데이터의 변경을 통보받았을 때 각각 처리하는 메서드
}