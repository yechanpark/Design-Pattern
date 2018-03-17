package creational.singleton.naive;

public class NaiveClient {
    private static final int THREAD_NUM = 5;

    public static void main(String[] args) {
        NaiveThread[] user = new NaiveThread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            user[i] = new NaiveThread((i + 1) + "-thread");
            user[i].start();
        }
    }
}
