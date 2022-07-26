package users;

import message.TextMessage;

import java.util.Scanner;

abstract class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    void fillMessage() {
        System.out.println("Enter your message: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        TextMessage tm = new TextMessage(text);
    }


}
