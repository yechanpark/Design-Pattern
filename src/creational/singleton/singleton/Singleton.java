package creational.singleton.singleton;

public class Singleton {
	// 선언과 함께 객체를 할당
	// getInstance()에서의 분기문을 근본적으로 없애, 성능의 향상과 소스코드의 간결함이라는 이득을 취함
	// getInstance()에서 synchronized 키워드를 쓰지 않기 때문에 성능의 하락을 방지할 수 있다.
	// static 함수에서 변수를 사용하는 경우, 해당 변수는 static변수여야 한다.
	private static Singleton singleton = new Singleton();
	int counter = 0;

	private Singleton() {
	}

	// static       : 전역에서 호출 가능
	public static Singleton getInstance() {
		return singleton;
	}

	// synchronized : Thread-Safe
	public synchronized void threadSafedMethod(String string) {
		counter++;
		System.out.println(string + " " + counter);
	}
}
