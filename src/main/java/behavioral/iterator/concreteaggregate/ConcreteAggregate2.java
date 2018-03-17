/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - ConcreteAggregate
 * */
package behavioral.iterator.concreteaggregate;

import behavioral.iterator.aggregate.Aggregate;
import behavioral.iterator.concreteiterator.ConcreteIterator1;
import behavioral.iterator.concreteiterator.ConcreteIterator2;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Book;

import java.util.ArrayList;
import java.util.List;

// ConcreteIterator2 인스턴스를 만들어냄
// Collection의 ArrayList 등에 해당
// 구체 집합체 - List Interface로 구현
public class ConcreteAggregate2 implements Aggregate {
    private List<Book> books;

    public ConcreteAggregate2() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength(){
        return this.books.size();
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator2(this);
    }
}
