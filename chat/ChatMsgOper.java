package chat;

import message.TextMessage;
import users.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class ChatMsgOper {
    Chat chat;

    public ChatMsgOper(Chat chat) {
        this.chat = chat;
    }

    Date dateNow = new Date();
    FilePath path = new FilePath();


    /**
     * Отправка сообщений. Принимает в себя экземпляр TextMessage, который вовзвращается после метода User.fillMessage(),
     * а также юзера-отправителя для отображения в хранилище сообщений. Так же указывается дата отпрвления.
     * @param msg - резульатат User.fillMessage().
     * @param sender - экземпляр, вызывающий fillMessage().
     * @throws IOException
     */
    public void sendTextMsg(TextMessage msg, User sender) throws IOException {
        FileWriter fileWriter = new FileWriter(path.actualFile, true);
        if (chat.members.contains(sender)) {
            fileWriter.write(msg.text + "\n" + sender.name + ", " + dateNow + "\n");
            fileWriter.flush();
            fileWriter.close();
        }
    }

    /**
     * Метод чтения хранилища. Так как путь к хранилищу задётся в отдельном классе, сигнатура метода не содержит
     * входных аргументов.
     * @throws IOException
     */
    public void readTextMessages() throws IOException {
        FileReader reader = new FileReader(path.actualFile);
        Scanner scan = new Scanner(reader);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }
}
