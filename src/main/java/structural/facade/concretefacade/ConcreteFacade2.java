package structural.facade.concretefacade;

import structural.facade.facade.Facade;

public class ConcreteFacade2 implements Facade {
    @Override
    public void operation() {
        System.out.println("ConcreteFacade2# operation()");
    }
}
