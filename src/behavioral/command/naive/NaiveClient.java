package behavioral.command.naive;

public class NaiveClient {
    public static void main(String args[]) {

        NaivePowerModule naivePowerModule = new NaivePowerModule();
        NaiveButton naiveButton = new NaiveButton(naivePowerModule);

        naiveButton.press();

    }
}
