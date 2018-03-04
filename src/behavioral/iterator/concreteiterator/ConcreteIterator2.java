/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - ConcreteIterator
 * */
package behavioral.iterator.concreteiterator;

import behavioral.iterator.concreteaggregate.ConcreteAggregate2;
import behavioral.iterator.iterator.Iterator;
import behavioral.iterator.model.Book;

// Iterator가 결정한 인터페이스를 실제로 구현, 검색을 위해 필요한 정보를 가지고 있어야 함
// 구체적인 개념인 ConcreteAggregate에 대한 검색을 지원한다.
public class ConcreteIterator2 implements Iterator {
    private ConcreteAggregate2 concreteAggregate2;
    private int index;

    public ConcreteIterator2(ConcreteAggregate2 concreteAggregate2){
        this.concreteAggregate2 = concreteAggregate2;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        if(index < concreteAggregate2.getLength())
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        Book book = concreteAggregate2.getBookAt(index++);
        return book;
    }
}
