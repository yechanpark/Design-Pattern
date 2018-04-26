package behavioral.memento.caretaker;

import behavioral.memento.memento.Memento;

import java.util.ArrayList;
import java.util.List;

// Managing Memento
public class CareTaker {
    private List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<Memento>();
    }

    // Save Memento (Came from Originator, Memento has Originator's Current State) to ArrayList
    public void add(Memento state){
        this.mementoList.add(state);
    }

    // Return Memento Object that has past state to Originator
    // Originator will be set state via this returned Memento object
    public Memento get(int index){
        return mementoList.get(index);
    }
}
