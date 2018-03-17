package behavioral.templatemethod.naive;

public class NaiveClient {
    public static void main(String args[]) {
        NaiveConcreteClass1 naiveConcreteClass1 = new NaiveConcreteClass1();
        NaiveConcreteClass2 naiveConcreteClass2 = new NaiveConcreteClass2();

        naiveConcreteClass1.call();
        System.out.println();
        naiveConcreteClass2.call();
    }
}
