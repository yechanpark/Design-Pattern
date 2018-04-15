package behavioral.mediator.naive;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String message;
    List<User> userList;

    public User(String name) {
        this.name = name;
        userList = new ArrayList<User>();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void chat() {
        for(User user : userList)
            user.receiveMessage(this);
    }

    public void receiveMessage(User user) {
        System.out.println("< " + this.name + "의 채팅창 >");
        System.out.println(user.name + " : " + user.message);
    }

}
