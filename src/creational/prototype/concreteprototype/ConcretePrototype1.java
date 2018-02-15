package creational.prototype.concreteprototype;

import creational.prototype.prototype.Prototype;

public class ConcretePrototype1 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (ConcretePrototype1)super.clone();
    }
}
