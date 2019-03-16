package JavaOOP.Lesson1.Lesson6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    public static void copyFile(File src, File goal) throws IOException {
        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(goal)) {
            for (; (readByte = fis.read(buffer)) > 0; ) {
                fos.write(buffer, 0, readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static long calculateFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        } else {
            long size = 0;
            File[] fileArray = folder.listFiles();
            for (File file : fileArray) {
                size += calculateFolderSize(file);
            }

            return size;
        }
    }
}






//    BufferedReader br = new BufferedReader(new
//            InputStreamReader(System.in));


//    File src = new File("a.txt");
//
//        try {
//                src.createNewFile();
//                } catch (IOException e) {
//                e.printStackTrace();
//                }
//                File folder = new File("a");
//
//                folder.mkdirs();
//                File to = new File(folder,"Book.txt");
//                try {
//                copyFile(src, to);
//                } catch (IOException e) {
//                e.printStackTrace();
//                }