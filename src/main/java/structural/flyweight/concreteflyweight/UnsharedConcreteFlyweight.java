package structural.flyweight.concreteflyweight;

import structural.flyweight.flyweight.Flyweight;

// UnShared Component (There are multiple objects)
public class UnsharedConcreteFlyweight implements Flyweight {

    @Override
    public int operation() {
        return this.hashCode();
    }
}
