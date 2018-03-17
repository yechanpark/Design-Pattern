/**
 * @author yechanpark
 * @since 2018. 02. 15
 * @description Prototype Pattern - ConcretePrototype
 * */
package creational.prototype.concreteprototype;

import creational.prototype.prototype.Prototype;

public class ConcretePrototype extends Prototype {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }
}
