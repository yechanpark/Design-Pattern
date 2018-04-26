package behavioral.memento.naive;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private List<Backup> backupList;
    private String value;

    public Context(){
        backupList = new ArrayList<Backup>();
        this.value = "";
    }

    public void append(String value) {
        this.value += value;
        System.out.println("Appended : " + this.value);
    }

    public void show() {
        System.out.println("Current Value : " + this.value);
    }

    public void save() {
        Backup backup = new Backup(this.value);
        backupList.add(backup);
        System.out.println("Saved Value : " + this.value);
    }

    public void load(int savePoint) {
        this.value = backupList.get(savePoint).getValue();
        System.out.println("Loaded Value : " + this.value);
    }
}
