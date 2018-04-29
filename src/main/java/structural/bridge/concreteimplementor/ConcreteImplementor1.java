package structural.bridge.concreteimplementor;

import structural.bridge.implementor.Implementor;

public class ConcreteImplementor1 implements Implementor {

    @Override
    public void implementation() {
        System.out.println(this.getClass().getSimpleName() + "# implementation()");
    }
}
