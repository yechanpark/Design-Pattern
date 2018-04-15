package behavioral.mediator.concretecolleague;

import behavioral.mediator.colleague.Colleague;

// User
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println(this.name + " recevied " + colleague.getName() + "'s Message : " + colleague.getMessage());
    }

}
