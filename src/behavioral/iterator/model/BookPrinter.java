package behavioral.iterator.model;

import behavioral.iterator.aggregate.Aggregate;
import behavioral.iterator.iterator.Iterator;

public class BookPrinter {
    private Aggregate aggregate;

    public void setAggregate(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public void print(){
        Iterator iterator = aggregate.iterator();

        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
