package creational.singleton.naive;

public class NaivePrinter {
    private static NaivePrinter naivePrinter;

    private NaivePrinter(){
    }

    public static NaivePrinter getNaivePrinter(){
        if(naivePrinter ==null)
            naivePrinter = new NaivePrinter();
        return naivePrinter;
    }

    public void print(String string) {
        System.out.println(string);
    }
}
