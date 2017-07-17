package behavioral.observer.observer;

public interface Observer { // 추상화된 통보 대상
    public abstract void update(); // 데이터의 변경을 통보했을 때 각각 처리하는 메서드
}