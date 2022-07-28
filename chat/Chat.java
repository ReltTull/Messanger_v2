package chat;

import users.User;

import java.util.ArrayList;

public class Chat {
    User holder;
    // Проблема: без static массивы не отображают добавленных юзеров.
    static public ArrayList<User> members = new ArrayList<>();
    static public ArrayList<User> admins = new ArrayList<>();
    static public ArrayList<User> blockedUsers = new ArrayList<>();

    /**
     * Создаю чат, сразу добавляя в него создателя. Проблема: создатель выводится в members два раза.
     * @param user
     */
    public Chat(User user) {
        this.holder = user;
        members.add(holder);
    }

    /**
     * Метод вывода юзеров из массивов. Чтобы не делать по методу на каждый массив.
     * @param caste - массивы, которые надо вывести.
     */
    public void showMembers (ArrayList<User> caste) {
        for (int i = 0; i < caste.size(); i++) {
            System.out.println(caste.get(i).name);
        }
    }

}
