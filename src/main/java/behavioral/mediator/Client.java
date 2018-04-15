package behavioral.mediator;

import behavioral.mediator.colleague.Colleague;
import behavioral.mediator.concretecolleague.ConcreteColleague1;
import behavioral.mediator.concretecolleague.ConcreteColleague2;
import behavioral.mediator.concretecolleague.ConcreteColleague3;
import behavioral.mediator.concretemediator.ConcreteMediator1;
import behavioral.mediator.mediator.Mediator;

public class Client {
    public static void main(String args[]) {
        Mediator mediator1 = new ConcreteMediator1();
        Colleague colleague1 = new ConcreteColleague1("User1");
        Colleague colleague2 = new ConcreteColleague1("User2");
        Colleague colleague3 = new ConcreteColleague2("System");
        Colleague colleague4 = new ConcreteColleague3("Admin");

        colleague1.setMediator(mediator1);
        colleague2.setMediator(mediator1);
        colleague3.setMediator(mediator1);
        colleague4.setMediator(mediator1);

        mediator1.addColleague(colleague1);
        mediator1.addColleague(colleague2);
        mediator1.addColleague(colleague3);
        mediator1.addColleague(colleague4);

        colleague1.setMessage("I'm User1");
        colleague1.send();
    }
}