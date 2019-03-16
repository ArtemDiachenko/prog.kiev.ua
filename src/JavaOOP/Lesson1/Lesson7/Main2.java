package JavaOOP.Lesson1.Lesson7;

public class Main2 {
    public static void main(String[] args) {
        Thread thr = new Thread(new KillerThread());
        thr.start();
    }


}
