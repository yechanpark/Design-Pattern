package behavioral.iterator.naive;

import java.util.ArrayList;
import java.util.List;

public class NaiveBookShelf2 {
    private List<Book> books;

    public NaiveBookShelf2(){
        this.books = new ArrayList<>();
    }

    public Book getBookFromNaiveBookShelf2At(int index){
        return this.books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLengthFromNaiveBookShelf2(){
        return this.books.size();
    }
}
