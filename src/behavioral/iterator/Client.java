/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - Client
 * */
package behavioral.iterator;

import behavioral.iterator.concreteaggregate.ConcreteAggregate;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Book;

public class Client {
    public static void main(String args[]) {

        ConcreteAggregate concreteAggregate = new ConcreteAggregate(4);
        concreteAggregate.appendBook(new Book("Book1"));
        concreteAggregate.appendBook(new Book("Book2"));
        concreteAggregate.appendBook(new Book("Book3"));
        concreteAggregate.appendBook(new Book("Book4"));

        Iterator iterator = concreteAggregate.iterator();

        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}