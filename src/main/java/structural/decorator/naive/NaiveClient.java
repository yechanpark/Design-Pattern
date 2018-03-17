package structural.decorator.naive;

public class NaiveClient {
    public static void main(String args[]) {

        // 기능을 수행하는 개체
        DefaultPrint print;

        // 기본기능
        print = new DefaultPrint();
        print.print();
        System.out.println();

        // 기본기능 + 추가기능 1
        print = new DefaultOption1Print();
        print.print();
        System.out.println();

        // 기본기능 + 추가기능 2
        print = new DefaultOption2Print();
        print.print();
        System.out.println();

        // 기본기능 + 추가기능 1 + 2
        print = new DefaultOption12Print();
        print.print();
        System.out.println();

        // 기본기능 + 추가기능 2 + 1
        print = new DefaultOption21Print();
        print.print();
    }
}
