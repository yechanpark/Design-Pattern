package structural.proxy.naive;

public class Server {
    Security security;

    public Server() {
        security = new Security();
    }

    public void printName(User user) {
        if(security.authenticate(user))
            System.out.println(user.getID() + " Authenticate Success");
        else
            System.out.println(user.getID() + " Authenticate Failed");
    }
}
