package structural.adapter.adapter;

import structural.adapter.adaptee.Adaptee;
import structural.adapter.targets.Target;

public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();

    @Override
    public void operation() {
        adaptee.find();
    }
}
