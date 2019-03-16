package JavaOOP.Lesson1.Lesson6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        2)
        File f = new File("a.txt");

        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File folder = new File("a");
        folder.mkdirs();

        File file2 = new File(folder, "b.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file2.delete();
        folder.delete();
        System.out.println("++++++++++++++++");
//        1)

        File file = new File(".");
        File [] fileArra = file.listFiles();
        for (File file1 : fileArra) {
            String type = file1.isFile() ? "File" : "Folder";
            System.out.println(type + " -> " + file1.getName() + " -> "+file1.length());
        }
    }
}
