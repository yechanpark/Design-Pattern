package structural.bridge.abstraction;

import structural.bridge.implementor.Implementor;

public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void doAbstraction();
}
