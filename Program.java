import chat.Chat;
import chat.ChatMsgOper;
import users.Administrator;
import users.Holder;
import users.RegularUser;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Holder bob = new Holder("Bob");
        Administrator lox = new Administrator("Lox");
        RegularUser dave = new RegularUser("Dave");
        Chat chat = new Chat(bob);
        bob.addInChat(lox);
        ChatMsgOper msgOper = new ChatMsgOper(chat);
        bob.addInChat(dave);
        dave.fillMessage();
//        bob.blockMember(dave);
//        chat.showMembers(Chat.members);
//        chat.showMembers(chat.members);
        msgOper.sendTextMsg(bob.fillMessage(), bob);
//        msgOper.readTextMessages();
//        Saver save = new Saver("Saves//nSave.odt");
//        save.fillSaveFile();
//        Loader load = new Loader("Saves//Save.txt");
//        load.loadSave();


    }


}
