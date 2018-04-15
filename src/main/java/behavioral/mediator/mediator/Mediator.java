package behavioral.mediator.mediator;

import behavioral.mediator.colleague.Colleague;

public interface Mediator {
    public void addColleague(Colleague colleague);
    public void mediate(Colleague colleague);
}
