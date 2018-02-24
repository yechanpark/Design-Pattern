package behavioral.strategy.naive;

// Hard to Change
public class NaiveConcreteContext1 extends NaiveContext {

    public NaiveConcreteContext1(String name) {
        this.setName(name);
    }

    @Override
    public void attack() {
        System.out.println("Punch");
    }

    @Override
    public void move() {
        System.out.println("Walking");
    }
}
