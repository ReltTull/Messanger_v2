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


    public Saver(String path) throws IOException {
        this.path = path;
        this.save = new File(path);
        save.createNewFile();
    }

    FilePath filePath = new FilePath();

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
