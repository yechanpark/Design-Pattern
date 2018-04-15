package behavioral.mediator.concretecolleague;

import behavioral.mediator.colleague.Colleague;

// Admin
public class ConcreteColleague3 extends Colleague {

    public ConcreteColleague3(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println("Admin can't receive messages");
    }

}
