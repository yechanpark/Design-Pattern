package structural.proxy.naive;

public class NaiveClient {
    public static void main(String args[]) {
        User user = new User("User1", "1234");
        Server server = new Server();

        server.printName(user);
    }
}
