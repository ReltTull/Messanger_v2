package saveload;

import chat.FilePath;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Saver {
    String path;
    File save;


    /**
     * Задаём путь к местоположению, где будет создан файл сохранение.
     * @param path
     * @throws IOException
     */
    public Saver(String path) throws IOException {
        this.path = path;
        this.save = new File(path);
        save.createNewFile();
    }

    FilePath filePath = new FilePath();

    /**
     * Запись сохранения из хранилища сообщений.
     * @throws IOException
     */
    public void fillSaveFile() throws IOException {
        FileReader reader = new FileReader(filePath.actualFile);
        Scanner scan = new Scanner(reader);
        FileWriter writer = new FileWriter(save);
        while (scan.hasNext()) {
            writer.write(scan.nextLine());
        }
        writer.flush();
        writer.close();
    }
}
