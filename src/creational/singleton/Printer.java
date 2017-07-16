package creational.singleton;

public class Printer {
	private static int counter = 0;

	// �޼��� ����ȭ, �������� ��� ����
	public synchronized static void print(String str) {
		counter++; // ī���� �� ����
		System.out.println(str + counter);
	}
}
