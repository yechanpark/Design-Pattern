package structural.decorator.naive;

public class DefaultOption1Print extends DefaultPrint{
    @Override
    public void print() {
        super.print();
        System.out.println("추가 기능 1");
    }
}
