package JavaOOP.Lesson1.Lesson6;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class Main2 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));

            String s1 = br.readLine();

        System.out.println("-> " + s1);
//        File src = new File("C:\\Users\\artem\\Desktop\\Java OOP java-2-0319.pdf");
//
//
//                File folder = new File("a");
//
//                folder.mkdirs();
//                File to = new File(folder,"123.pdf");
//                try {
//                FileOperation.copyFile(src, to);
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
    }

}

