package behavioral.strategy.naive;

// Hard to Change
public class NaiveConcreteContext2 extends NaiveContext {

    public NaiveConcreteContext2(String name) {
        this.setName(name);
    }

    @Override
    public void attack() {
        System.out.println("Missile");
    }

    @Override
    public void move() {
        System.out.println("Flying");
    }
}
