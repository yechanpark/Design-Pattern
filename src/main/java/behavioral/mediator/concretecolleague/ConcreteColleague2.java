package behavioral.mediator.concretecolleague;

import behavioral.mediator.colleague.Colleague;

// System
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("System can't receive messages");
    }

}
