package creational.singleton;

public class UserThread extends Thread {
	public UserThread(String name) { // 스레드 생성
		super(name);
	}

	public void run() { // 현재 스레드 이름 출력
		Printer.print(Thread.currentThread().getName() + " print using " + ".");
	}
}