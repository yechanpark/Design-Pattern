/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - Client
 * */
package behavioral.iterator;

import behavioral.iterator.concreteaggregate.ConcreteAggregate1;
import behavioral.iterator.concreteaggregate.ConcreteAggregate2;
import behavioral.iterator.model.Book;
import behavioral.iterator.model.BookPrinter;

public class Client {
    public static void main(String args[]) {

        ConcreteAggregate1 concreteAggregate1 = new ConcreteAggregate1(4);
        concreteAggregate1.appendBook(new Book("Book1"));
        concreteAggregate1.appendBook(new Book("Book2"));
        concreteAggregate1.appendBook(new Book("Book3"));
        concreteAggregate1.appendBook(new Book("Book4"));

        ConcreteAggregate2 concreteAggregate2 = new ConcreteAggregate2();
        concreteAggregate2.appendBook(new Book("Book1"));
        concreteAggregate2.appendBook(new Book("Book2"));
        concreteAggregate2.appendBook(new Book("Book3"));
        concreteAggregate2.appendBook(new Book("Book4"));

        BookPrinter printer = new BookPrinter();

        printer.setAggregate(concreteAggregate1);
        printer.print();

        printer.setAggregate(concreteAggregate2);
        printer.print();
    }
}