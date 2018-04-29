package structural.flyweight.concreteflyweight;

import structural.flyweight.flyweight.Flyweight;


// Shared Component (There is only one object)
/* Warnning : 만약 이 클래스가 'FlyweightFactory' 클래스의 내부 클래스로 정의되지 않는다면,
              이 클래스는 'UnsharedConcreteFlyweight' 역할을 하게 된다. 즉, 이 클래스는 사용되지 않는다.  */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public int operation() {
        return this.hashCode();
    }
}
