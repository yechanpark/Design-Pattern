package structural.bridge;

import structural.bridge.abstraction.Abstraction;
import structural.bridge.concreteimplementor.ConcreteImplementor1;
import structural.bridge.concreteimplementor.ConcreteImplementor2;
import structural.bridge.implementor.Implementor;
import structural.bridge.refindabstraction.RefinedAbstraction1;
import structural.bridge.refindabstraction.RefinedAbstraction2;

public class Client {
    public static void main(String args[]) {
        Abstraction abstraction1 = new RefinedAbstraction1();
        Implementor implementor1 = new ConcreteImplementor1();
        abstraction1.setImplementor(implementor1);
        abstraction1.doAbstraction();


        Abstraction abstraction2 = new RefinedAbstraction2();
        Implementor implementor2 = new ConcreteImplementor2();
        abstraction2.setImplementor(implementor2);
        abstraction2.doAbstraction();
    }
}