/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - ConcreteIterator
 * */
package behavioral.iterator.concreteiterator;

import behavioral.iterator.concreteaggregate.ConcreteAggregate1;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Book;

// Iterator가 결정한 인터페이스를 실제로 구현, 검색을 위해 필요한 정보를 가지고 있어야 함
// 구체적인 개념인 ConcreteAggregate에 대한 검색을 지원한다.
public class ConcreteIterator1 implements Iterator {
    private ConcreteAggregate1 concreteAggregate1;
    private int index;

    public ConcreteIterator1(ConcreteAggregate1 concreteAggregate1){
        this.concreteAggregate1 = concreteAggregate1;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if(index < concreteAggregate1.getLength())
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        Book book = concreteAggregate1.getBookAt(index++);
        return book;
    }
}
