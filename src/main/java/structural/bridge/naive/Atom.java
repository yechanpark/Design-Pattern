package structural.bridge.naive;

public class Atom {
    private final String robotType = "Atom";
    private Punch punch;

    public void setPunch(Punch punch) {
        this.punch = punch;
    }

    public void attack() {
        System.out.println(robotType + " : " + punch.getName());
    }
}
