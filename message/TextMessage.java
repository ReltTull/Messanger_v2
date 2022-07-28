package message;

import users.User;

public class TextMessage extends Message{
    public String text;
    public TextMessage(String msgText) {
        this.text = msgText;
    }
}
