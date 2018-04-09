package structural.bridge.concreteimplementor;

import structural.bridge.implementor.Implementor;

public class ConcreteImplementor2 implements Implementor {

    @Override
    public void implementation() {
        System.out.println("ConcreteImplementor2# implementation()");
    }
}
