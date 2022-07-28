package saveload;

import chat.FilePath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Loader {
    File savePath;
    FilePath workFile = new FilePath();

    public Loader(String path) {
        this.savePath = new File(path);
    }

    public void loadSave() throws IOException {
        cleanWorkFile();
        FileReader reader = new FileReader(savePath);
        Scanner scan = new Scanner(reader);
        FileWriter writer = new FileWriter(workFile.actualFile);
        while (scan.hasNext()) {
            writer.write(scan.nextLine());
        }
        writer.flush();
        writer.close();
    }

    void cleanWorkFile () throws IOException {
        FileReader reader = new FileReader(workFile.actualFile);
        Scanner scan = new Scanner(reader);
        FileWriter deleter = new FileWriter(workFile.actualFile);
        while (scan.hasNext()) {
            deleter.write("");
        }
        deleter.flush();
        deleter.close();
    }
}
