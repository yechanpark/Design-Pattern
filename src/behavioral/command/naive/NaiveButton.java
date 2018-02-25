package behavioral.command.naive;

public class NaiveButton {
    private NaivePowerModule naivePowerModule;

    public NaiveButton(NaivePowerModule naivePowerModule) {
        this.naivePowerModule = naivePowerModule;
    }

    public void press() {
        naivePowerModule.turnOn();
    }

}
