package creational.singleton;

public class Printer {
	private static int counter = 0;

	// 메서드 동기화, 전역에서 사용 가능
	public synchronized static void print(String str) {
		counter++; // 카운터 값 증가
		System.out.println(str + counter);
	}
}
