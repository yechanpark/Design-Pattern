package creational.singleton.naive;

public class NaiveThread extends Thread {
    public NaiveThread(String name) { // 스레드 생성
        super(name);
    }

    public void run() { // 현재 스레드 이름 출력
        NaivePrinter naivePrinter = NaivePrinter.getNaivePrinter();
        naivePrinter.print(this.getName() + " " + naivePrinter.hashCode());
    }
}
