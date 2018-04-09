package structural.bridge.naive;

public class NaiveClient {
    public static void main(String args[]) {
        Punch punch = new Punch();
        Atom atom = new Atom();

        atom.setPunch(punch);
        atom.attack();
    }
}
