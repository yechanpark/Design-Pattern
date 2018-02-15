/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - ConcreteIterator
 * */
package behavioral.iterator.concreteiterator;

import behavioral.iterator.concreteaggregate.ConcreteAggregate;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Book;

// Iterator가 결정한 인터페이스를 실제로 구현, 검색을 위해 필요한 정보를 가지고 있어야 함
// Aggregate를 검색한다.
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate){
        this.concreteAggregate = concreteAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if(index < concreteAggregate.getLength())
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        Book book = concreteAggregate.getBookAt(index++);
        return book;
    }
}
