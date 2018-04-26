package behavioral.memento.naive;

public class Backup {
    private String value;


    public Backup(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
