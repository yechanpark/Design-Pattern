package behavioral.strategy.naive;

public class NaiveClient {
    public static void main(String args[]) {

        NaiveContext naiveContext;

        naiveContext= new NaiveConcreteContext1("Robot 1");
        System.out.println(naiveContext.getName());
        naiveContext.move();
        naiveContext.attack();


        naiveContext = new NaiveConcreteContext2("Robot 2");
        System.out.println(naiveContext.getName());
        naiveContext.move();
        naiveContext.attack();
    }
}
