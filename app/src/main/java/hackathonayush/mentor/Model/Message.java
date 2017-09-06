package com.a2doodh.a2doodhapp.model;

/**
 * Created by user on 27-Aug-17.
 */

public class Message {

    public String message, sender;
   public String time;

    public Message() {
    }

    public Message(String message, String time, String sender) {
        this.message = message;
        this.time = time;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

    public String getTime() {
        return time;
    }
}
