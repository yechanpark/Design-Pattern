package structural.bridge.refindabstraction;

import structural.bridge.abstraction.Abstraction;

public class RefinedAbstraction2 extends Abstraction {
    @Override
    public void doAbstraction() {
        System.out.println("RefinedAbstraction2# doAbstraction()");
        this.implementor.implementation();
    }
}
