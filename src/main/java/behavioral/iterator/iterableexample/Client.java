package behavioral.iterator.iterableexample;

public class Client {
    public static void main(String args[]) {
        StringNumber stringNumber = new StringNumber();

        stringNumber.addStringNumebr("One");
        stringNumber.addStringNumebr("Two");
        stringNumber.addStringNumebr("Three");

        StringNumberPrinter stringNumberPrinter = new StringNumberPrinter();
        stringNumberPrinter.setStringNumber(stringNumber);
        stringNumberPrinter.print();

    }
}
