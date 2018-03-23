package structural.proxy.naive;

public class NaiveClient {
    public static void main(String args[]) {
        User user1 = new User("User1", "1234");
        User user2 = new User("User1", "123");
        User user3 = new User("User2", "1234");
        Server server = new Server();

        server.printName(user1);
        server.printName(user2);
        server.printName(user3);
    }
}
