package structural.facade;

import structural.facade.concretefacade.ConcreteFacade1;
import structural.facade.concretefacade.ConcreteFacade2;
import structural.facade.concretefacade.ConcreteFacade3;
import structural.facade.facade.Facade;

public class Client {
    public static void main(String args[]) {
        Facade facade1 = new ConcreteFacade1();
        Facade facade2 = new ConcreteFacade2();
        Facade facade3 = new ConcreteFacade3();

        facade1.operation();
        facade2.operation();
        facade3.operation();
    }
}