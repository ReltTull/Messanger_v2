package message;

public class TextMessage extends Message{
    public String text;
    public TextMessage(String msgText) {
        this.text = msgText;
    }
}
