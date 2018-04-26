package behavioral.memento.naive;

public class NaiveClient {
    public static void main(String args[]) {
        Context context = new Context();
        context.append("First");
        context.append("Second");
        context.show();

        context.save();

        context.append("Third");
        context.show();

        context.load(0);
        context.show();



    }
}
