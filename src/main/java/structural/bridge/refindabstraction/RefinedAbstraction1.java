package structural.bridge.refindabstraction;

import structural.bridge.abstraction.Abstraction;

public class RefinedAbstraction1 extends Abstraction {
    @Override
    public void doAbstraction() {
        System.out.println(this.getClass().getSimpleName() + "# doAbstraction()");
        this.implementor.implementation();
    }
}
