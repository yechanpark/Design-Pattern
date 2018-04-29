package behavioral.memento.originator;

import behavioral.memento.memento.Memento;

// 현재 다루는 요소
public class Originator {
    private String state;

    // State Changed By Business Logic
    public void setState(String state){
        this.state = state;
    }

    // Return Current State
    public String getState(){
        return this.state;
    }

    // Saving Current State via Memento Object and Return
    // This Memento Object will be served by CareTaker's add() Method
    public Memento createMemento(){
        return new Memento(this.state);
    }

    // Load State - Can Implement Redo, Undo
    public void restore(Memento memento){
        this.state = memento.getState();
    }
}
