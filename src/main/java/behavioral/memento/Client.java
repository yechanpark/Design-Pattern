package behavioral.memento;

import behavioral.memento.caretaker.CareTaker;
import behavioral.memento.originator.Originator;

public class Client {
    public static void main(String args[]) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.createMemento()); // save #1

        originator.setState("State #3");
        careTaker.add(originator.createMemento()); // save #2

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());


        originator.restore(careTaker.get(0)); // load #1
        System.out.println("First saved State: " + originator.getState());

        originator.restore(careTaker.get(1)); // load #2
        System.out.println("Second saved State: " + originator.getState());
    }

}