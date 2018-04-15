package behavioral.mediator.concretemediator;

import behavioral.mediator.colleague.Colleague;
import behavioral.mediator.mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator1 implements Mediator {
    private List<Colleague> colleagueList;

    public ConcreteMediator1() {
        this.colleagueList = new ArrayList<Colleague>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagueList.add(colleague);
    }

    @Override
    public void mediate(Colleague colleague) {
        for(Colleague receiverColleague : colleagueList) {
            System.out.println("\tMediating " + colleague.getName() + " to " + receiverColleague.getName());
            receiverColleague.receive(colleague);
        }
    }
}
