/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - Aggregate
 * */
package behavioral.iterator.aggregate;

import behavioral.iterator.iterator.Iterator;

// 반복자인 Iterator를 만들어내는 인터페이스를 결정.
// 집합체를 나타내므로 Collection에 해당
public interface Aggregate {
    public abstract Iterator iterator();
}
