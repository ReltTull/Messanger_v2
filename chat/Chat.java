package chat;

import users.User;

import java.util.ArrayList;

public class Chat {
    User holder;
    public static ArrayList<User> members = new ArrayList<>();
    public ArrayList<User> admins = new ArrayList<>();
    public ArrayList<User> blockedUsers = new ArrayList<>();
    public Chat(User user) {
        this.holder = user;
        members.add(holder);
    }

    public void showMembers (ArrayList<User> caste) {
        for (int i = 0; i < caste.size(); i++) {
            System.out.println(caste.get(i).name);
        }
    }

}
