package structural.proxy.naive;

public class Security {
    private final String authID = "User1";
    private final String authPW = "1234";

    public boolean authenticate(User user) {
        return (authID.equals(user.getID()) && authPW.equals(user.getPW()));
    }

}
