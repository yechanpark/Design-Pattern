package structural.proxy.naive;

public class User {
    private String ID;
    private String PW;

    public User(String ID, String PW) {
        this.ID = ID;
        this.PW = PW;
    }

    public String getID() {
        return ID;
    }

    public String getPW() {
        return PW;
    }
}
