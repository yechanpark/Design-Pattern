package behavioral.mediator.naive;

public class NaiveClient {
    public static void main(String args[]) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        User user4 = new User("User4");

        user1.addUser(user1);
        user1.addUser(user2);
        user1.addUser(user3);
        user1.addUser(user4);

        /*
        * user2~4.addUser(user1~4);
        */

        user1.setMessage("I'm User1");
        user1.chat();
        
    }
}
