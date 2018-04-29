package structural.facade.concretefacade;

import structural.facade.facade.Facade;

public class ConcreteFacade1 implements Facade {
    @Override
    public void operation() {
        System.out.println(this.getClass().getSimpleName() + "# operation()");
    }
}
