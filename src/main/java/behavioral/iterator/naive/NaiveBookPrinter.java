package behavioral.iterator.naive;

public class NaiveBookPrinter {
    NaiveBookShelf1 naiveBookShelf1;

    public void setNaiveBookShelf(NaiveBookShelf1 naiveBookShelf1){
        this.naiveBookShelf1 = naiveBookShelf1;
    }

    public void print() {
        for(int i=0; i<naiveBookShelf1.getLengthFromNaiveBookShelf1(); i++){
            Book book = naiveBookShelf1.getBookFromNaiveBookShelf1At(i);
            System.out.println(book.getName());
        }
    }
}

