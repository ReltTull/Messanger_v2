package users;

import message.TextMessage;

import java.util.Scanner;
import chat.ChatMsgOper;
import saveload.Saver;

public abstract class User {
    public String name;
    public String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    TextMessage fillMessage() {
        System.out.println("Enter your message: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        TextMessage tm = new TextMessage(text);
        return tm;


    }


}
