package structural.flyweight;

import structural.flyweight.concreteflyweight.UnsharedConcreteFlyweight;
import structural.flyweight.flyweight.Flyweight;
import structural.flyweight.flyweightfactory.FlyweightFactory;

public class Client {
    public static void main(String args[]) {
        // When need Shared Object
        Flyweight flyweight1 = FlyweightFactory.getFlyweight(1);
        System.out.println(flyweight1.operation());

        Flyweight flyweight2 = FlyweightFactory.getFlyweight(2);
        System.out.println(flyweight2.operation());

        Flyweight flyweight3 = FlyweightFactory.getFlyweight(1);
        System.out.println(flyweight3.operation());

        // When need UnShared Object
        Flyweight flyweight4 = new UnsharedConcreteFlyweight();
        System.out.println(flyweight4.operation());

        /* Compile Error (Cannot resolve symbol 'ConcreteFlyweight')
           : Can't Instantiate here. Must instantiate in 'FlyweightFactory' */
        // Flyweight flyweight5 = new ConcreteFlyweight();

    }
}
