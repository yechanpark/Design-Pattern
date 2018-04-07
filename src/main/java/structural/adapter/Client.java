package structural.adapter;

import structural.adapter.adaptee.Adaptee;
import structural.adapter.adapter.Adapter;
import structural.adapter.targets.Target;

public class Client {
    public static void main(String args[]) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter().setAdaptee(adaptee);
        target.adaptiveOperation1();
        target.adaptiveOperation2();
    }
}