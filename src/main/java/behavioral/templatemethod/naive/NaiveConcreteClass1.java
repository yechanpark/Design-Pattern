package behavioral.templatemethod.naive;

public class NaiveConcreteClass1 {

    public void call(){
        logic1();
        logic2();
        uniqueMethod();
        logic3();
    }

    private void logic1(){
        System.out.println("logic1()");
    }
    private void logic2(){
        System.out.println("logic2()");
    }
    private void logic3(){
        System.out.println("logic3()");
    }
    private void uniqueMethod(){
        System.out.println("This is NaiveConcreteClass1");
    }
}
