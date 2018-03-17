package creational.prototype.caretaker;

import creational.prototype.prototype.Prototype;

public class Caretaker {
    private Prototype prototype;

    public Caretaker(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype copyPrototype() throws CloneNotSupportedException {
        return (Prototype) prototype.clone();
    }
}
