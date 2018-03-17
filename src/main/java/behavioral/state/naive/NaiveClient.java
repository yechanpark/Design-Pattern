package behavioral.state.naive;

public class NaiveClient {
    public static void main(String args[]) {
        NaiveLight light = new NaiveLight();

        light.off();

        light.on();
        light.on();
        light.on();
        light.on();
        light.on();
        light.off();

        light.on();
        light.on();
        light.on();
        light.off();

    }
}
