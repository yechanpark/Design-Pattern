package behavioral.iterator.naive;

public class NaiveClient {
    public static void main(String args[]) {
        NaiveBookShelf1 naiveBookShelf1 = new NaiveBookShelf1(4);

        naiveBookShelf1.appendBook(new Book("책1"));
        naiveBookShelf1.appendBook(new Book("책2"));
        naiveBookShelf1.appendBook(new Book("책3"));
        naiveBookShelf1.appendBook(new Book("책4"));

        NaiveBookPrinter naiveBookPrinter = new NaiveBookPrinter();
        naiveBookPrinter.setNaiveBookShelf(naiveBookShelf1);
        naiveBookPrinter.print();

    }
}
