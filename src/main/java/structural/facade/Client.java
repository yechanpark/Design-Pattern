package structural.facade;

import structural.facade.concretefacade.ConcreteFacade1;
import structural.facade.concretefacade.ConcreteFacade2;
import structural.facade.concretefacade.ConcreteFacade3;
import structural.facade.facade.Facade;

public class Client {
    public static void main(String args[]) {
        Facade facade;

        facade = new ConcreteFacade1();
        facade.operation();

        facade = new ConcreteFacade2();
        facade.operation();

        facade = new ConcreteFacade3();
        facade.operation();
    }
}