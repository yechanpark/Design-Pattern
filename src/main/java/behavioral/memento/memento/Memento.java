package behavioral.memento.memento;

// Originator의 상태를 나타내는 클래스
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

}
