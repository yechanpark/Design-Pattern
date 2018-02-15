/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Iterator Pattern - Iterator
 * */
package behavioral.iterator.iterator;

// 요소를 순서대로 검색해가는 인터페이스를 결정
public interface Iterator {
    // '다음 요소'가 존재하는지를 조사
    public abstract boolean hasNext();

    // '다음 요소'를 얻어옴
    public abstract Object next();
}
