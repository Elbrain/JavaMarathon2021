package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public void subscribe(User user){
        if (subscriptions.contains(user)){
            System.out.println("Этот пользователь уже есть в ваших подписках");
        } else subscriptions.add(user);

    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user){
        return subscriptions.contains(user) && user.subscriptions.contains(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return  username;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}

