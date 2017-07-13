package creational.singleton;

public class Printer {
    private static int counter = 0;
 
    public synchronized static void print(String str) { // 메서드 동기화
        counter++; // 카운터 값 증가
        System.out.println(str + counter);
    }
}
