package users;

import chat.Chat;
import message.TextMessage;

public class Holder extends User{
    public Holder(String name) {
        super(name, "Chat holder");
    }

    @Override
    public TextMessage fillMessage() {
        return super.fillMessage();
    }
    Chat chat = new Chat(Holder.this);

    /**
     * Холдер может менять состав администраторов, добавляя и удаляя из соответствующего массива.
     * @param candidate
     */
    void addAdmin(User candidate) {
        if (chat.members.contains(candidate)) {
            chat.admins.add(candidate);
            System.out.println(candidate.name + " is administrator.");
        }
    }

    public void removeAdmin(User user) {
        if (chat.admins.contains(user)) {
            chat.admins.remove(user);
            System.out.println(user.name + " was removed from administrators.");
        }
    }

    public void addInChat(User user) {
            chat.members.add(user);
    }
    public void blockMember(User user) {
        chat.blockedUsers.add(user);
        chat.members.remove(user);
        System.out.println(user.name + " has been blocked.");
    }

}
