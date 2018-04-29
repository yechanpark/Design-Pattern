package behavioral.memento.naive;

public class NaiveClient {
    public static void main(String args[]) {
        Text text = new Text();
        text.append("First");
        text.append("Second");
        text.show();

        text.save();

        text.append("Third");
        text.show();

        text.load(0);
        text.show();

    }
}
