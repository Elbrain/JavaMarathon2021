package day13;

import java.sql.Timestamp;
import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Timestamp timestamp;


    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    //getter for date


    @Override
    public String toString() {
        return "FROM: " + sender +
                " TO: " + receiver +
                " ON: " +timestamp + " " +
                text;
    }
}
