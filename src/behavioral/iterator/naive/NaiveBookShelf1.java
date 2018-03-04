package behavioral.iterator.naive;

public class NaiveBookShelf1 {
    private Book[] books;
    private int last = 0;

    public NaiveBookShelf1(int maxsize){
        this.books = new Book[maxsize];
    }

    public Book getBookFromNaiveBookShelf1At(int index){
        return this.books[index];
    }

    public void appendBook(Book book){
        this.books[last++] = book;
    }

    public int getLengthFromNaiveBookShelf1(){
        return this.last;
    }
}
