package structural.flyweight.flyweightfactory;

import structural.flyweight.flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<Integer, Flyweight> flyweightMap = new HashMap<Integer, Flyweight>();

    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(int key) {

        // When key is not exist in Map
        if (!flyweightMap.containsKey(key))
            flyweightMap.put(key, new ConcreteFlyweight());

        // When key is exist in Map
        return flyweightMap.get(key);

    }

    // Shared Component (There is only one object)
    // 파일로서 존재하는 ConcreteFlyweight Class는 사용되지 않지만, 이 내부 클래스는 실질적으로 사용된다.
    private static class ConcreteFlyweight implements Flyweight{

        @Override
        public int operation() {
            return this.hashCode();
        }
    }

}
