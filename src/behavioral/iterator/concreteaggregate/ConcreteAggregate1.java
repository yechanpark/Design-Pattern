/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - ConcreteAggregate
 * */
package behavioral.iterator.concreteaggregate;

import behavioral.iterator.aggregate.Aggregate;
import behavioral.iterator.concreteiterator.ConcreteIterator1;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Book;

// ConcreteIterator1 인스턴스를 만들어냄
// Collection의 ArrayList 등에 해당
// 구체 집합체 - Array로 구현
public class ConcreteAggregate1 implements Aggregate {
    private Book[] books;
    private int last = 0;

    public ConcreteAggregate1(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator1(this);
    }
}
