package behavioral.mediator.colleague;

import behavioral.mediator.mediator.Mediator;

// 상호 간 통신을 하는 클래스들의 추상적인 개념
public abstract class Colleague {
    private Mediator mediator;
    protected String name;
    private String message;

    public Colleague(String name){
        this.name = name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void send() {
        System.out.println(this.name + " send()");
        System.out.println();
        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);
}
