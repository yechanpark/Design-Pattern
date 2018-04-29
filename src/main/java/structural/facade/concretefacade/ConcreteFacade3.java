package structural.facade.concretefacade;

import structural.facade.facade.Facade;

public class ConcreteFacade3 implements Facade {
    @Override
    public void operation() {
        System.out.println(this.getClass().getSimpleName() + "# operation()");
    }
}
