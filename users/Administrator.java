package users;

import chat.Chat;
import message.TextMessage;

public class Administrator extends User {
    public Administrator(String name) {
        super(name, "Administrator");
    }

    Chat chat;
    @Override
    public TextMessage fillMessage() {
        return super.fillMessage();
    }

    /**
     * Администратор может добавлять юзеров в массив members (может - не совсем корректно, учитывая, что массивы с
     * модификатором доступа public, то есть вносить изменения в массивы могут не только юзеры).
     * @param user
     */
    public void addInChat(User user) {
        if (!chat.blockedUsers.contains(user)) {
            chat.members.add(user);
            System.out.println(user.name + " has been added to chat.");
        }
    }

    /**
     * Администратор может блокировать юзера, удаляя его из members.
     * @param user
     */
    public void blockMember(User user) {
        chat.blockedUsers.add(user);
        chat.members.remove(user);
        System.out.println(user.name + " has been blocked.");
    }
}
