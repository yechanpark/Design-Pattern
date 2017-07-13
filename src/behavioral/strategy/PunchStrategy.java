package behavioral.strategy;

public class PunchStrategy implements AttackStrategy {
    public void attack() {
        System.out.println("Punch");
    }
}