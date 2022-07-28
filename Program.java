import chat.Chat;
import chat.ChatMsgOper;
import users.Holder;
import users.RegularUser;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Holder bob = new Holder("Bob");
        RegularUser dave = new RegularUser("Dave");
        Chat chat = new Chat(bob);
        ChatMsgOper msgOper = new ChatMsgOper(chat);
        bob.addInChat(dave);
//        chat.showMembers(chat.members);
//        msgOper.sendTextMsg(bob.fillMessage(), bob);
//        msgOper.readTextMessages();
//        Saver save = new Saver("Saves//nSave.odt");
//        save.fillSaveFile();
//        Loader load = new Loader("Saves//Save.txt");
//        load.loadSave();


    }


}
