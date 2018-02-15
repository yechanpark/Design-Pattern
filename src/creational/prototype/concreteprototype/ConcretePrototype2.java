package creational.prototype.concreteprototype;

import creational.prototype.prototype.Prototype;

public class ConcretePrototype2 extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (ConcretePrototype2)super.clone();
    }
}
